package com.gustavocoutinho.primeiroapplicativo

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // recuperar os componentes Editext
        // Criar uma variavel e associar o componente de UI

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)



        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text
            println("Gustavo ação do Botao = "+ peso + altura)
        }
    }
}