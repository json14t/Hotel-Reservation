package sample;

/**
 * Created by jasoncampoverde on 11/17/17.
 */
public class Room {

    private boolean isRoomAvailable;
    private int roomNumber;
    private boolean isSmokingAllowed;
    private boolean isInternetAvailable;
    private boolean hasTv;
    private boolean hasFridge;
    private boolean hasMicrowave;


    //Constructor
    Room(){
        isRoomAvailable = true;
    }


    //Get and Set for whether room has a fridge
    public boolean hasFridge(){
        return hasFridge;
    }
    public void setHasFridge( boolean hasFridge ){
        this.hasFridge = hasFridge;
    }



    //Get and Set for whether a room has a microwave
    public boolean hasMicrowave(){
        return hasMicrowave;
    }
    public void setHasMicrowave( boolean hasMicrowave ){
        this.hasMicrowave = hasMicrowave;
    }

    //Get and Set for whether tv is avaialble
    public boolean hasTv(){
        return hasTv;
    }
    public void setHasTv( boolean hasTv){
        this.hasTv = hasTv;
    }


    //Get and Set for whether internet is available
    public boolean isInternetAvailable() {
        return isInternetAvailable;
    }
    public void setInternetAvailable( boolean isInternetAvailable ){
        this.isInternetAvailable = isInternetAvailable;
    }

    //Get and Set for whether smoking is allowed
    public boolean isSmokingAllowed(){
        return isSmokingAllowed;
    }
    public void setSmokingAllowed( boolean isSmokingAllowed ){
        this.isSmokingAllowed = isSmokingAllowed;
    }


    // Get and Set for room availability
    public boolean isRoomAvailable(){
        return isRoomAvailable;
    }
    public void reserveRoom(){
        isRoomAvailable = false;
    }


    //Get and Set for room number
    public int getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber( int roomNumber ){
        this.roomNumber = roomNumber;
    }

}
