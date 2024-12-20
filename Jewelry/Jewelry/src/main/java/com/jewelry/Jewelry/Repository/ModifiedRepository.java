package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.Modified;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModifiedRepository extends JpaRepository<Modified, Long> {
    // Thêm các phương thức nếu cần thiết
}
