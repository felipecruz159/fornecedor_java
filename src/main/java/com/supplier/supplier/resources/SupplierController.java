package com.supplier.supplier.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.supplier.supplier.entities.Supplier;
import com.supplier.supplier.services.SupplierService;

@RestController
@CrossOrigin
public class SupplierController {
    
    @Autowired
    private SupplierService supplierService;

    @GetMapping("suppliers/{id}")
    public Supplier getSupplier(@PathVariable int id){
        return supplierService.getSupplierById(id);
    }

    @GetMapping("suppliers")
    public List<Supplier> getSuppliers(){
        return supplierService.getSuppliers();
    }

}
