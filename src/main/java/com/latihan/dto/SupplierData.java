package com.latihan.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class SupplierData {
    @NotEmpty(message = "name is required")
    private String name;

    @NotEmpty(message = "address is required")
    private String address;
    
    @NotEmpty(message = "email is required")
    @Email(message = "Email is not valid")
    private String email;

    private String phone;
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
