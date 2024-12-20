package com.jewelry.Jewelry.Service.Jewelry;

import com.jewelry.Jewelry.Model.Jewelry;
import com.jewelry.Jewelry.Repository.JewelryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JewelryServiceImpl implements JewelryService {

    @Autowired
    private JewelryRepository jewelryRepository;

    @Override
    public List<Jewelry> getAllJewelry() {
        return jewelryRepository.findAll();
    }

    @Override
    public Optional<Jewelry> getJewelryById(Long id) {
        return jewelryRepository.findById(id);
    }



    @Override
    public Jewelry createJewelry(Jewelry jewelry) {
        return jewelryRepository.save(jewelry); // lưu trang sức mới
    }

    @Override
    public Jewelry updateJewelry(Long id, Jewelry jewelry) {
        if (jewelryRepository.existsById(id)) {
            jewelry.setId(id); // Đảm bảo id không thay đổi
            return jewelryRepository.save(jewelry); // cập nhật trang sức
        }
        return null; // nếu không tồn tại id, trả về null
    }

    @Override
    public void deleteJewelry(Long id) {
        if (jewelryRepository.existsById(id)) {
            jewelryRepository.deleteById(id); // xóa trang sức theo id
        }
    }
    @Override
    public List<Jewelry> getJewelryByName(String name) {
        // Gọi phương thức findByNameContainingIgnoreCase để tìm kiếm các trang sức có tên chứa chuỗi name
        return jewelryRepository.findByNameContainingIgnoreCase(name);
    }
}
