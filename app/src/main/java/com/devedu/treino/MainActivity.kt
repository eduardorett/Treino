package com.devedu.treino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soma.setOnClickListener { _ ->
            calculate()
        }
        menos.setOnClickListener{ _ ->
            calculatemenos()
        }
        multiplicacao.setOnClickListener{ _ ->
            calculatemultiplicacao()
        }
        divisao.setOnClickListener{ _ ->
            calculatedivisao()
        }
    }




    private fun calculate() {

        if (validationOk()) {
            try{

                val preco = editPreco.text.toString().toFloat()
                val autonomy = editAutonomia.text.toString().toFloat()

                val totalValue = preco + autonomy
                textTotalValue.text = "${"%.2f".format(totalValue)}"

            } catch (nfe: NumberFormatException){
                Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
        }
    }

    private fun calculatemenos() {

        if (validationOk()) {
            try{

                val preco = editPreco.text.toString().toFloat()
                val autonomy = editAutonomia.text.toString().toFloat()

                val totalValue = preco - autonomy
                textTotalValue.text = "${"%.2f".format(totalValue)}"

            } catch (nfe: NumberFormatException){
                Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
            }
        }else {
            Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
        }
    }

    private fun calculatemultiplicacao() {

        if (validationOk()) {
            try{

                val preco = editPreco.text.toString().toFloat()
                val autonomy = editAutonomia.text.toString().toFloat()

                val totalValue = preco * autonomy
                textTotalValue.text = "${"%.2f".format(totalValue)}"

            } catch (nfe: NumberFormatException){
                Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
            }
        }else {
            Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
        }
    }

    private fun calculatedivisao() {

        if (validationOk()) {
            try{

                val preco = editPreco.text.toString().toFloat()
                val autonomy = editAutonomia.text.toString().toFloat()

                val totalValue = preco / autonomy
                textTotalValue.text = "${"%.2f".format(totalValue)}"

            } catch (nfe: NumberFormatException){
                Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
            }
        }else {
            Toast.makeText(this,getString(R.string.campos),Toast.LENGTH_LONG).show()
        }
    }

    fun validationOk():Boolean{

        return(editAutonomia.text.toString() != ""
                && editPreco.text.toString() != ""
                )

    }
}





