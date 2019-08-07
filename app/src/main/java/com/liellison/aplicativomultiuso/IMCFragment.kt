package com.liellison.aplicativomultiuso


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_imc.*
import kotlinx.android.synthetic.main.fragment_imc.view.*


class IMCFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_imc, container, false)
        view.btIMC.setOnClickListener{calcIMC()}
        return view
    }

    companion object {
        fun newInstance(): IMCFragment = IMCFragment()
    }

    private fun calcIMC(){
        if(eTPeso.text.toString() != "" && eTAltura.text.toString() != ""){
            val peso : Float = eTPeso.text.toString().toFloat()
            val altura : Float = eTAltura.text.toString().toFloat()
            val resultado = (peso / (altura * altura)).toString().toFloat()
            val resultadostr = (peso / (altura * altura)).toString()

            if(resultado in 16.0..16.9) {
                tVIMCResultado.setText("Teu IMC deu "+resultadostr+"\nClassificação: Muito abaixo do peso\nO que pode acontecer: Queda de cabelo, infertilidade, ausência menstrual")
            }
            if(resultado in 17.0..18.4) {
                tVIMCResultado.setText("Teu IMC deu "+resultadostr+"\nClassificação: Abaixo do peso\nO que pode acontecer: Fadiga, stress, ansiedade")
            }
            if(resultado in 18.4..24.9) {
                tVIMCResultado.setText("Teu IMC deu "+resultadostr+"\nClassificação: Peso normal\nO que pode acontecer: Menor risco de doenças cardíacas e vasculares")
            }
            if(resultado in 25.0..29.9) {
                tVIMCResultado.setText("Teu IMC deu "+resultadostr+"\nClassificação: Acima do peso\nO que pode acontecer: Fadiga, má circulação, varizes")
            }
            if(resultado in 30.0..34.9) {
                tVIMCResultado.setText("Teu IMC deu "+resultadostr+"\nClassificação: Obesidade Grau I\nO que pode acontecer: Diabetes, angina, infarto, aterosclerose")
            }
            if(resultado in 35.0..40.0) {
                tVIMCResultado.setText("Teu IMC deu "+resultadostr+"\nClassificação: Obesidade Grau II\nO que pode acontecer: Apneia do sono, falta de ar")
            }
            if(resultado > 40.1) {
                tVIMCResultado.setText("Teu IMC deu "+resultadostr+"\nClassificação: Obesidade Grau III\nO que pode acontecer: Refluxo, dificuldade para se mover, escaras, diabetes, infarto, AVC")
            }
        }
    }

}
