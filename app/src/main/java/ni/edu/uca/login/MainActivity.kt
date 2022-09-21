package ni.edu.uca.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ni.edu.uca.login.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
val codigo: String = "Kevin"
val pwd: String = "1234"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciar()
    }
    fun iniciar(){
        binding.btnOk.setOnClickListener{
            val id = binding.etUsuario.text.toString()
            val pw = binding.etPW.text.toString()
            validarCredenciales(id, pw)
        }
    }

    private fun validarCredenciales(id: String, pw: String) {
        if (id.equals(codigo) && pw.equals(pwd)){
            Toast.makeText(this, "BIENVENIDO", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "ERROR EN CREDENCIALES", Toast.LENGTH_SHORT).show()
        }
    }
}