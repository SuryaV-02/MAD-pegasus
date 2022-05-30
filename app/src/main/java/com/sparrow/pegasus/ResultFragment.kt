package com.sparrow.pegasus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast


import android.content.res.TypedArray
import android.widget.Button
import kotlin.random.Random





// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var instance: ResultFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        instance  = this
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_result, container, false)
        var btn_findpair = view.findViewById<com.google.android.material.button.MaterialButton>(R.id.btn_findpair)
        btn_findpair.setOnClickListener {
            changeImageContent(view)
        }
        return view
    }

    fun GetInstance(): ResultFragment? {
        return instance
    }

    fun changeImageContent(view: View) {
//        Toast.makeText(activity, "Test", Toast.LENGTH_SHORT).show()
        var iv_result = view.findViewById<ImageView>(R.id.iv_result)
        val imgs = resources.obtainTypedArray(R.array.apptour)
        val rndInt = Random.nextInt(imgs.length())
        val resID : Int = imgs.getResourceId(rndInt, 0)
        iv_result.setImageDrawable(resources.getDrawable(resID))
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ResultFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}