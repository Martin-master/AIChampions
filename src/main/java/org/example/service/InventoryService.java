package org.example.service;

import org.example.model.Inventory;
import org.example.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

   private final InventoryRepository inventoryRepository;

   @Autowired
   public InventoryService(InventoryRepository inventoryRepository) {
      this.inventoryRepository = inventoryRepository;
   }

   public Inventory saveInventory(Inventory inventory) {
      return inventoryRepository.save(inventory);
   }

   public List<Inventory> getAllInventory() {
      return inventoryRepository.findAll();
   }
}