package com.test.questionsandroid.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.test.questionsandroid.R

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            (requireActivity() as MainActivity).setSelectedItem(2)
            (requireActivity() as MainActivity).removeBadge(2)
        }

//        (requireActivity() as MainActivity).setBadge(2)
//        (requireActivity() as MainActivity).setBadge(0)
    }

}