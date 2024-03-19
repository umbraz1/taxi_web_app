package com.dev.taxi_app.Model;



public class Driver {
    private int driver_id;
    private int userId;
    private String firstName;
    private String lastName;
    private int rating;
    private String autoModel;
    private String status;

    public int getDriverId(){
        
        return driver_id;
    }

    public int getUserId(){

       return userId; 
    }

    public String getDriverFname(){

        return firstName;
    }

    public String getDriverLname(){

        return lastName;
    }
        

    public int getRating(){

        return rating;
    }

    public String getAutoModel(){

        return autoModel;
    }

    public String getStatus(){

        return status;
    }

    
    public void setDriverFname(String firstName){

        this.firstName = firstName;
    }
 

    public void setDriverLname(String lastName){

        this.lastName = lastName;
    }

    public void setDriverRating(int phone){

        this.rating = rating;
    }

    public void  setDriverAutoModel(int role){

        this.autoModel = autoModel;
    }


    public void setDriverStatus(String email){

        this.status = status;
    }
}
