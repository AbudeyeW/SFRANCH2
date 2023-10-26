package com.example.SFRANCH.Packages_Offered;

public class Packages_Offered {

    private Long id;
    private String Package_Name;
    private String Package_Description;
    private Integer Package_duration;

    public Packages_Offered() {
    }

    public Packages_Offered(Long id, String package_Name, String package_Description, Integer package_duration) {
        this.id = id;
        Package_Name = package_Name;
        Package_Description = package_Description;
        Package_duration = package_duration;
    }

    public Packages_Offered(String package_Name, String package_Description, Integer package_duration) {
        Package_Name = package_Name;
        Package_Description = package_Description;
        Package_duration = package_duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackage_Name() {
        return Package_Name;
    }

    public void setPackage_Name(String package_Name) {
        Package_Name = package_Name;
    }

    public String getPackage_Description() {
        return Package_Description;
    }

    public void setPackage_Description(String package_Description) {
        Package_Description = package_Description;
    }

    public Integer getPackage_duration() {
        return Package_duration;
    }

    public void setPackage_duration(Integer package_duration) {
        Package_duration = package_duration;
    }

    @Override
    public String toString() {
        return "Packages_Offered{" +
                "id=" + id +
                ", Package_Name='" + Package_Name + '\'' +
                ", Package_Description='" + Package_Description + '\'' +
                ", Package_duration=" + Package_duration +
                '}';
    }
}
