import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Ravi on 7/19/2016.
 */
public class Citypreference {
    SharedPreferences prefs;

    public void CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "London, SYS");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}
