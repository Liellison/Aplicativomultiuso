package com.liellison.aplicativomultiuso


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_consumo.*
import kotlinx.android.synthetic.main.fragment_consumo.view.*
import kotlinx.android.synthetic.main.fragment_consumo.view.eTLKM


class ConsumoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_consumo, container, false)
        view.btGasolina.setOnClickListener { calcGasolina() }
        return view
    }

    private fun calcGasolina() {
        if(eTLKM.text.toString() != "" && eTPreco.text.toString() != "" && eTDistancia.text.toString() != ""){
            val litros : Float = eTLKM.text.toString().toFloat()
            val preco: Float = eTPreco.text.toString().toFloat()
            val distancia: Float = eTDistancia.text.toString().toFloat()
            val litrosporkm = (distancia / litros).toString().toFloat()

            val litrosporkmString = (distancia / litros).toString()
            val precoLitros = (litrosporkm * preco).toString()
            tVGasolina.setText("Nesta viajem você vai gastar "+ litrosporkmString+" litros \ne vai ser um total de R$"+ precoLitros)
        }
    }

    companion object {
        fun newInstance(): ConsumoFragment = ConsumoFragment()
    }


}
