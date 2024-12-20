package com.jewelry.Jewelry.Service.Modified;

import com.jewelry.Jewelry.Model.Modified;

import java.util.List;
import java.util.Optional;

public interface ModifiedService {
    List<Modified> getAllModified();
    Optional<Modified> getModifiedById(Long id);
    Modified createModified(Modified modified);
    Modified updateModified(Long id, Modified modified);
    void deleteModified(Long id);
}
