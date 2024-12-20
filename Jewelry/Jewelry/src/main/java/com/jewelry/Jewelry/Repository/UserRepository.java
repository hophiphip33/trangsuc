package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Tìm người dùng theo username
}
