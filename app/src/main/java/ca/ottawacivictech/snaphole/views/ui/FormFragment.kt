package ca.ottawacivictech.snaphole.views.ui


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ca.ottawacivictech.snaphole.R
import ca.ottawacivictech.snaphole.viewmodels.FormViewModel


/**
 * A simple [Fragment] subclass.
 */
class FormFragment : Fragment() {
    private var model: FormViewModel? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        model = ViewModelProviders.of(activity).get(FormViewModel::class.java)
        val locationDisplayText = view!!.findViewById<TextView>(R.id.locationDisplay)

        val locObserver = Observer<String> { locDisplay ->
            // Update the UI, in this case, a TextView.
            locationDisplayText.text = locDisplay
        }
        model!!.getLocationDisplay(activity)!!.observe(this, locObserver)
    }
}// Required empty public constructor
