package com.jewelry.Jewelry.Controller;

import com.jewelry.Jewelry.Model.Modified;
import com.jewelry.Jewelry.Service.Modified.ModifiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/modified")
public class ModifiedController {

    @Autowired
    private ModifiedService modifiedService;

    @GetMapping
    public List<Modified> getAllModified() {
        return modifiedService.getAllModified();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Modified> getModifiedById(@PathVariable Long id) {
        return modifiedService.getModifiedById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Modified createModified(@RequestBody Modified modified) {
        return modifiedService.createModified(modified);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Modified> updateModified(@PathVariable Long id, @RequestBody Modified modified) {
        return ResponseEntity.ok(modifiedService.updateModified(id, modified));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModified(@PathVariable Long id) {
        modifiedService.deleteModified(id);
        return ResponseEntity.noContent().build();
    }
}
