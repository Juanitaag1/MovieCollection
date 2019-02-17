//This class will represent the Director entity
//Will have an Overrided toString method, the String representation of a Director

package com.example.poppi.moviecollectionapp.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Director {

    @PrimaryKey (autoGenerate = true)
    @NonNull
    public int id;
    public String firstName;
    public String lastName;

    //constructor will have a id, firstName and lastName
    public Director(int id, String firstName, String  lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Overrided toString the String representation of a Director
    @Override
    public String toString(){
        return "Director { id:" + id  + ", First name: " + firstName + ", Last name: " + lastName + "}";
    }
}
