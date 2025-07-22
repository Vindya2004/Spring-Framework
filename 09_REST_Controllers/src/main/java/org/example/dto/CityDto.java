package org.example.dto;

public class CityDto {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CityDto{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
    public CityDto(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public CityDto() {}
}
