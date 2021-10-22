package com.stmikbanisaleh.smart_md.Model_Ok.Login2.Entity;

public class User {


    private String name;
    private String address;
    private String area_coverage;
    private String city;
    private String role;
    private String email;

    public String getEmail(){
        return  email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getArea_coverage() {
        return area_coverage;
    }

    public void setArea_coverage(String area_coverage) {
        this.area_coverage = area_coverage;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
