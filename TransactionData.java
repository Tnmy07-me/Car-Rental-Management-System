package carrentalmanagementsystem;
import java.sql.Date;

public class TransactionData {
    
    private Integer customerId;
    private String firstName;
    private String lastName;
    private Integer carId;
    private Date dateRented;
    private Date dateReturn;
    private Double total;

   public TransactionData(int customerId, String firstName, String lastName, int carId, Date dateRented, Date dateReturn, double total) {
    this.customerId = customerId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.carId = carId;
    this.dateRented =  dateRented;
    this.dateReturn =  dateReturn;
    this.total = total;
}

    public Integer getCustomerId(){
        return customerId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Integer getCarId(){
        return carId;
    }    
    public Date getDateRented(){
        return dateRented;
    }
    public Date getDateReturn(){
        return dateReturn;
    }
    public Double getTotal(){
        return total;
    }    
}