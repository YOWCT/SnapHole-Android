package ca.ottawacivictech.snaphole.viewmodels

import android.app.Activity
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.google.android.gms.location.LocationServices


/**
 * Created by ansaf on 2/27/2018.
 */
class FormViewModel:ViewModel() {

    var locationDisplay: MutableLiveData<String>? = null


    fun getLocationDisplay(activity: Activity): MutableLiveData<String>? {
        if (locationDisplay == null) {
            locationDisplay = MutableLiveData<String>()
            try {
                LocationServices.getFusedLocationProviderClient(activity).lastLocation.addOnSuccessListener { location ->
                    locationDisplay!!.value = "Latitude: ${location.latitude} \nLongitude: ${location.longitude}"
                }
            } catch (e: SecurityException) {
                e.printStackTrace()
            }
        }

        return locationDisplay
    }
}