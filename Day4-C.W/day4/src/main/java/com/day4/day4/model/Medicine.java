package com.day4.day4.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    public int medicineId;
    public String medicinename;
    public String medicineFor;
    public String medicinePrice;
    public String medicineFrom;
    public String medicineBrand;
    public String medicineDate;


    
    public Medicine(int medicineId, String medicinename, String medicineFor, String medicinePrice,
            String medicineFrom, String medicineBrand, String medicineDate) {
        this.medicineId = medicineId;
        this.medicinename = medicinename;
        this.medicineFor = medicineFor;
        this.medicinePrice = medicinePrice;
        this.medicineFrom = medicineFrom;
        this.medicineBrand = medicineBrand;
        this.medicineDate = medicineDate;
    }
    public Medicine()
    {
        
    }
    public int getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public String getMedicinename() {
        return medicinename;
    }
    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(String medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getMedicineFrom() {
        return medicineFrom;
    }
    public void setMedicineFrom(String medicineFrom) {
        this.medicineFrom = medicineFrom;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public String getMedicineDate() {
        return medicineDate;
    }
    public void setMedicineDate(String medicineDate) {
        this.medicineDate = medicineDate;
    }
    
        
}
