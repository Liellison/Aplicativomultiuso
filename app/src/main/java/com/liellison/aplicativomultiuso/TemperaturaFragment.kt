package com.liellison.aplicativomultiuso

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_temperatura.*
import kotlinx.android.synthetic.main.fragment_temperatura.view.*


class TemperaturaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        val view: View = inflater.inflate(R.layout.fragment_temperatura, container, false)
        view.btconverter.setOnClickListener { conversor() }
        return view
    }

    companion object {
        fun newInstance(): TemperaturaFragment = TemperaturaFragment()
    }

    private fun conversor(){
       if(eTcelsius.text.toString() != ""){
           val celsius : Float = eTcelsius.text.toString().toFloat()
           val resulttt = (((celsius / 5) * 9) + 32).toString()
           eTfahrenheit.setText(resulttt)
    }
        if(eTfahrenheit.text.toString() != ""){
            val fahrenheit : Float = eTfahrenheit.text.toString().toFloat()
            val resulttt = ((fahrenheit - 32) / 1.8000).toString()
            eTcelsius.setText(resulttt)
        }
    }
}


