package com.phandat.thuchanh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldNumber = ""
    var op = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        if(isNewOp)
            editText.setText("")
        isNewOp = false
        var click = editText.text.toString()
        var select = view as Button
        when(select.id) {
            btn0.id -> {click += "0"}
            btn1.id -> {click += "2"}
            btn2.id -> {click += "3"}
            btn3.id -> {click += "4"}
            btn4.id -> {click += "5"}
            btn5.id -> {click += "6"}
            btn6.id -> {click += "7"}
            btn8.id -> {click += "8"}
            btn9.id -> {click += "9"}
            btnch.id -> {click += "."}
        }
        editText.setText((click))
    }

    fun operaEvent(view: View) {
        isNewOp = true
        oldNumber = editText.text.toString()
        var select = view as Button
        when(select.id) {
            btnco.id -> {op = "+"}
            btnt.id -> {op = "-"}
            btnn.id -> {op = "*"}
            btnc.id -> {op = "/"}
        }
    }

    fun equalEvent(view: View) {
        var newnumber = editText.text.toString()
        var result = 0.0
        when(op) {
            "+" -> {result = oldNumber.toDouble() + newnumber.toDouble()}
            "-" -> {result = oldNumber.toDouble() - newnumber.toDouble()}
            "*" -> {result = oldNumber.toDouble() * newnumber.toDouble()}
            "/" -> {result = oldNumber.toDouble() / newnumber.toDouble()}
        }
        editText.setText(result.toString())
    }

    fun EcEvent(view: View) {
        editText.setText("0")
        isNewOp = true
    }

}