/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalmanagementsystem;

import java.sql.Date;

public class carData {
    
    private Integer carId;
    private String brand;
    private String model;
    private Double price;
    private String status;
    private Date date;
    private String image;
    
    public carData(Integer carId, String brand, String model
            , Double price, String status, String image, Date date){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.status = status;
        this.date = date;
        this.image = image;
    }

    carData(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5, double aDouble, Date date, Date date0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Integer getCarId(){
        return carId;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public Double getPrice(){
        return price;
    }
    public String getStatus(){
        return status;
    }
    public Date getDate(){
        return date;
    }
    public String getImage(){
        return image;
    }
    
}
