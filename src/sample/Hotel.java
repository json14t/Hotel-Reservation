package sample;

/**
 * Created by jasoncampoverde on 11/17/17.
 */
public class Hotel {

    private String hotelName;
    private int numberOfRooms;
    private int starRating;
    private boolean hasPool;
    private boolean hasGym;
    private boolean hasRestaurant;



    Hotel( String hotelName, int numberOfRooms, int starRating ){
        this.hotelName = hotelName;
        this.numberOfRooms = numberOfRooms;
        this.starRating = starRating;
    }


    //Get and Set for hotel name
    public String getHotelName(){
        return hotelName;
    }
    public void setHotelName( String hotelName ){
        this.hotelName = hotelName;
    }


    //Get and Set for number of rooms in hotel
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public void setNumberOfRooms( int numberOfRooms ){
        this.numberOfRooms = numberOfRooms;
    }



    //Get and Set for htoel star rating
    public int getStarRating(){
        return starRating;
    }
    public void setStarRating( int starRating ){
        this.starRating = starRating;
    }
}
