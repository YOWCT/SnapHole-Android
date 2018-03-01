package ca.ottawacivictech.snaphole.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.MutableLiveData



/**
 * Created by ansaf on 2/27/2018.
 */
class FormViewModel:ViewModel() {
    var latitude:MutableLiveData<Double> = MutableLiveData<Double>()
    var longitude:MutableLiveData<Double> = MutableLiveData<Double>()

    fun getLatitude():LiveData<Double>{

        return latitude
    }

    fun getLongitude():LiveData<Double>{

        return longitude
    }

    fun findLatitude(){

    }
    fun findLongitude(){

    }
}