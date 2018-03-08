package ca.ottawacivictech.snaphole.services.repository.location

import com.google.android.gms.location.FusedLocationProviderClient

/**
 * Created by ansaf on 3/6/2018.
 */
class LocationService(locationClient: FusedLocationProviderClient) {
    var locationClient: FusedLocationProviderClient? = null
    var lat: Double? = null
    var lon: Double? = null

    init {

        try {
            locationClient.lastLocation.addOnSuccessListener { location ->
                run {
                    lat = location.latitude
                    lon = location.longitude
                }
            }
        } catch (e: SecurityException) {
            e.printStackTrace()
        }


    }


    fun displayData(): String {
        return "Latitude: ${this.lat} Longitude: ${this.lon}"
    }
}