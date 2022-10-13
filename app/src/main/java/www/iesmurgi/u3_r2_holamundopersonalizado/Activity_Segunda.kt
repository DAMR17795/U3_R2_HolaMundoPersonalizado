package www.iesmurgi.u3_r2_holamundopersonalizado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity_Segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mostrarNombre()
        val bottonVolver: Button =findViewById(R.id.btFinalizar)
        bottonVolver.setOnClickListener{onBackPressed()}
        //setContentView(R.layout.activity_segunda)
    }

    private fun mostrarNombre() {
        val mibundle=intent.extras
        val nombre = mibundle?.getString("SALUDO")
        val tvSaludoPer=findViewById<TextView>(R.id.tvSaludoPer)
        tvSaludoPer.text=nombre
    }
}