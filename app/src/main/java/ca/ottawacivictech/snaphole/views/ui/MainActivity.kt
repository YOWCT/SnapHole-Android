package ca.ottawacivictech.snaphole.views.ui
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import ca.ottawacivictech.snaphole.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runMenu()
    }


    fun runMenu(){
        val fragment = MenuFragment()
        supportFragmentManager.beginTransaction()
                .add(R.id.mainActivityHolder,fragment,"Menu")
                .commit()
    }


}
