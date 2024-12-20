package com.jewelry.Jewelry.Controller;

import com.jewelry.Jewelry.Model.Jewelry;
import com.jewelry.Jewelry.Service.Jewelry.JewelryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jewelry")
public class JewelryController {

    @Autowired
    private JewelryService jewelryService;

    @GetMapping
    public List<Jewelry> getAllJewelry() {
        return jewelryService.getAllJewelry();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jewelry> getJewelryById(@PathVariable Long id) {
        return jewelryService.getJewelryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Jewelry createJewelry(@RequestBody Jewelry jewelry) {
        return jewelryService.createJewelry(jewelry);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jewelry> updateJewelry(@PathVariable Long id, @RequestBody Jewelry jewelry) {
        return ResponseEntity.ok(jewelryService.updateJewelry(id, jewelry));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJewelry(@PathVariable Long id) {
        jewelryService.deleteJewelry(id);
        return ResponseEntity.noContent().build();
    }
}
