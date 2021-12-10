package com.example.animation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : Fragment() {

    private var values: Int = 10
    private val name: String? = "Ajay"
    private val uiManager = UIManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        number1.text = "Hello 10"

        // we are communicate with java files here
        uiManager.setClgId(values)
        uiManager.setName("ajay")


        click?.setOnClickListener {
            number1.text = "Hello" + values++
            Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show()

            callView()
        }

    }

    private fun callView() {
        Log.d("Main123", "Hello :" + uiManager.getName() + uiManager.getClgId() + "" )
    }

    override fun onDestroy() {
        super.onDestroy()
        //_binding=null
    }
}