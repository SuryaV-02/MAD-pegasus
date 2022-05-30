package com.sparrow.pegasus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val frag_ipt: Fragment =
//            getActivity(this)!!.getFragmentManager().findFragmentById(R.id.frag_ipt)
//
//        val fragment: inputFragment =
//            fragmentManager.findFragmentById(R.id.frag_ipt) as inputFragment

        val frag: ResultFragment? = ResultFragment().GetInstance()

    }
}