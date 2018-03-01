package ca.ottawacivictech.snaphole.views.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ca.ottawacivictech.snaphole.R


/**
 * A simple [Fragment] subclass.
 */
class FormFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_form, container, false)
    }

}// Required empty public constructor
