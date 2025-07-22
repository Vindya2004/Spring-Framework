package org.example.dto;

public class UserDto {
    private String uid;
    private String uName;
    private String uPassword;
    private CityDto uCity;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "uid='" + uid + '\'' +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uCity='" + uCity + '\'' +
                '}';
    }

    public UserDto(String uid, String uName, String uPassword, CityDto uCity) {
        this.uid = uid;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uCity = uCity;
    }
    public UserDto() {

    }

    public CityDto getuCity() {
        return uCity;
    }

    public void setuCity(CityDto uCity) {
        this.uCity = uCity;
    }
}
