package com.dev.taxi_app.Model;



public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private int phone;
    private int role;
    private String email;

    public int getUserId(){

       return userId; 
    }

    public String getUserFname(){

        return firstName;
    }

    public String getUserLname(){

        return lastName;
    }
        

    public int getPhone(){

        return phone;
    }

    public int getRole(){

        return role;
    }

    
    public String getEmail(){

        return email;
    }

    public void setUserId(int userId){

        this.userId = userId;
    } 

    public void setUserFname(String firstName){

        this.firstName = firstName;
    }
 

    public void setUserLname(String lastName){

        this.lastName = lastName;
    }

    public void setUserPhone(int phone){

        this.phone = phone;
    }

    public void  setUserRole(int role){

        this.role = role;
    }


    public void setUserEmail(String email){

        this.email = email;
    }
}
