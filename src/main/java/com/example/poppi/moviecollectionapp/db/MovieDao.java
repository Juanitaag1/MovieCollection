//interface will contain the methods to access databae
// The CRUD methods to be executed against the database

package com.example.poppi.moviecollectionapp.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.poppi.moviecollectionapp.Models.Movie;

import java.util.List;

@Dao
public interface MovieDao {

    //method to insert the Movie records
    //Returns the movie id
    //in SQLite had to use the contentValues to insert records
    //after create this method can connect this class to datasource
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long createMovie(Movie movie);

    //query that returns a list all of the movie records
    @Query("SELECT * FROM movie")
    List<Movie> getAllMovies();

}


