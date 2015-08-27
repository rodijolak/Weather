package se.example.weather;

import android.app.Activity;
import android.content.SharedPreferences;
 
public class CityPreference {
     
    SharedPreferences prefs;
     
    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }
     
    // If the user has not chosen a city yet, set Milano as a default
    String getCity(){
        return prefs.getString("city", "Milano, IT");        
    }
     
    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
     
}
