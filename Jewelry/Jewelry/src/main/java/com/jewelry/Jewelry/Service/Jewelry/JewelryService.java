package com.jewelry.Jewelry.Service.Jewelry;

import com.jewelry.Jewelry.Model.Jewelry;

import java.util.List;
import java.util.Optional;

public interface JewelryService {
    List<Jewelry> getAllJewelry();
    Optional<Jewelry> getJewelryById(Long id);
    List<Jewelry> getJewelryByName(String name);
    Jewelry createJewelry(Jewelry jewelry);
    Jewelry updateJewelry(Long id, Jewelry jewelry);
    void deleteJewelry(Long id);
}
