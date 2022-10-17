package www.iesmurgi.u3_r2_holamundopersonalizado
//DANIEL ALEJANDRO MARTÍN ROMERO - 2ºDAM 2021/2022
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity_Segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //importante
        setContentView(R.layout.activity_segunda)
        val bottonVolver: Button =findViewById(R.id.btFinalizar)
        bottonVolver.setOnClickListener{onBackPressed()}
        mostrarNombre()
    }
    private fun mostrarNombre() {
        val mibundle=intent.extras
        val nombre = mibundle?.getString("SALUDOS")
        val tvSaludoPer=findViewById<TextView>(R.id.tvSaludoPer)
        tvSaludoPer.text="Bienvenido " + nombre
    }
}