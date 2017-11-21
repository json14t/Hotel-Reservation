package sample;

/**
 * Created by jasoncampoverde on 11/20/17.
 */
public class Reservation {
    private String customerName;
    private double roomCost;
    private String checkInDate;
    private String checkOutDate;

    //Room object that accepts an Int for the room number
    Reservation(  String customerName, int roomCost ){
        this.customerName = customerName;
        this.roomCost = roomCost;

    }

    // Get and set for customer name
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName( String customerName ){
        this.customerName = customerName;
    }


    //Get and set for room cost
    public double getRoomCost(){
        return roomCost;
    }
    public void setRoomCost( double roomCost ){
        this.roomCost = roomCost;
    }

    //Get and set for check in date
    public String getCheckInDate(){
        if( checkInDate != null ){
            return checkInDate;
        }
        else {
            return "No check in date set.";
        }
    }
    public void setCheckInDate( String checkInDate ){
        this.checkInDate = checkInDate;
    }


    //Get and set for checkout date
    public String getCheckOutDate(){
        if ( checkOutDate != null ){
            return checkOutDate;
        }
        else {
            return "No check out date set.";
        }
    }
    public void setCheckOutDate( String checkOutDate ){
        this.checkOutDate = checkOutDate;
    }

}
