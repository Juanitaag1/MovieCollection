//This class will represent the Movie Entity
//Overrided toString the String representation of a Movie

package com.example.poppi.moviecollectionapp.Models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

//The primaryKeys allows combination to be unique when working with this table
//the indices used to speed up Querys when we are using particular fields
@Entity (tableName = "Movie",
        primaryKeys = {"title", "Director"},
        indices = {@Index("Director")},
        foreignKeys = @ForeignKey(entity = Director.class,
        parentColumns = "id",
        childColumns = "Director"))
public class Movie {

    //we have set up the entity above so nolonger need the id and getter and setters
   // @PrimaryKey(autoGenerate = true)
    //public int id;
    @NonNull
    public  String title;
    public  String year;
    public int Director;
    @ColumnInfo(name = "run_time")
    public  String runtime;
    public  String collection; // y or n
    @Ignore
    public Director mDirector;


    //Will construct a Movie object
    public Movie(String title, String year, int Director, String runtime, String  collection){
       // this.id = id;
        this.title =title;
        this.year = year;
        this.Director = Director;
        this.runtime = runtime;
        this.collection = collection;
    }

    //Will return a Movie id
 /**   public int getId(){
        return id;
    }

    //Will set a Movie id
    public void setId(int id) {
        this.id = id;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public int getDirector() {
        return Director;
    }

    public void setDirector(int director) {
        Director = director;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public com.example.poppi.moviecollectionapp.Models.Director getmDirector() {
        return mDirector;
    }

    public void setmDirector(com.example.poppi.moviecollectionapp.Models.Director mDirector) {
        this.mDirector = mDirector;
    }

    //Overrided toString the String representation of a Movie
    @Override
    public String toString(){
        return "Movie { " +  "title='" + title + '\'' +  ", year='"
                + year + '\'' + ", Director=" + Director +  ", runtime=" + runtime
                +  ", collection=" + collection + '}';


    }
}
