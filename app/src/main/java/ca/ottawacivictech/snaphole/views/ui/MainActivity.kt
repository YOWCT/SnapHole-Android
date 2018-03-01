package ca.ottawacivictech.snaphole.views.ui

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import ca.ottawacivictech.snaphole.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runMenu().commit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val REQUEST_CODE = resources.getInteger(R.integer.request_camera)


        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            //TODO Add way to access data
            runForm().commit()
        }


    }

    fun runMenu(): FragmentTransaction {
        return supportFragmentManager.beginTransaction()
                .add(R.id.mainActivityHolder, MenuFragment(), "Menu")
    }

    fun runForm(): FragmentTransaction {
        return supportFragmentManager.beginTransaction()
                .add(R.id.mainActivityHolder, FormFragment(), "Form")
                .addToBackStack("Form")

    }


}
