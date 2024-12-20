package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModifiedDTO {
    private LocalDateTime createdAt;   // Thời điểm tạo
    private LocalDateTime updatedAt;   // Thời điểm cập nhật
}
