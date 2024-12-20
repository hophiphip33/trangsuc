package com.jewelry.Jewelry.Service.Modified;

import com.jewelry.Jewelry.Model.Modified;
import com.jewelry.Jewelry.Repository.ModifiedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModifiedServiceImpl implements ModifiedService {

    @Autowired
    private ModifiedRepository modifiedRepository;

    @Override
    public List<Modified> getAllModified() {
        return modifiedRepository.findAll();
    }

    @Override
    public Optional<Modified> getModifiedById(Long id) {
        return modifiedRepository.findById(id);
    }

    @Override
    public Modified createModified(Modified modified) {
        return modifiedRepository.save(modified);
    }

    @Override
    public Modified updateModified(Long id, Modified modified) {
        if (modifiedRepository.existsById(id)) {
            modified.setId(id);
            return modifiedRepository.save(modified);
        }
        throw new IllegalArgumentException("Modified with id " + id + " not found.");
    }

    @Override
    public void deleteModified(Long id) {
        if (modifiedRepository.existsById(id)) {
            modifiedRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Modified with id " + id + " not found.");
        }
    }
}
