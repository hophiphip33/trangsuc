package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.Jewelry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JewelryRepository extends JpaRepository<Jewelry, Long> {
    // Tìm kiếm trang sức theo tên
    List<Jewelry> findByName(String name);  // Tìm chính xác theo tên

    // Hoặc, nếu bạn muốn tìm kiếm theo một phần tên, bạn có thể sử dụng:
    List<Jewelry> findByNameContainingIgnoreCase(String name);  // Tìm theo tên chứa chuỗi (không phân biệt chữ hoa/thường)

}
