//interface will contain the methods to access databae
// The CRUD methods to be executed against the database
package com.example.poppi.moviecollectionapp.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;

import com.example.poppi.moviecollectionapp.Models.Director;

import java.util.List;

@Dao
public interface DirectorDao {

    //method to insert the Director records
    //Returns the Director id
    //in SQLite had to use the contentValues to insert records
    //after create this method can connect this class to datasource
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long createDirector(Director director);


    //do this if want to insert a list of directors like the recipeSteps the many to one
    //recipe have many steps here Movie has one director
    //void because not interested in returning rowIds could do long[]addDirector();
 //   @Insert
  //  void insertAll(List<Director> director);
}
