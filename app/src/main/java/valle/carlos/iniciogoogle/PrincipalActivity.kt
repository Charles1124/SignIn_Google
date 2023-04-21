package valle.carlos.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle= intent.extras
        if(bundle!=null){
            val nombre= bundle.getString("name")
            val correo= bundle.getString("email")

            val tv_nombre= findViewById(R.id.tv_nombre) as TextView
            val tv_email= findViewById(R.id.tv_email) as TextView

            tv_nombre.setText(nombre)
            tv_email.setText(correo)
        }

        val btn_cerrar= findViewById(R.id.btn_cerrar) as Button
        btn_cerrar.setOnClickListener{
            finish()
        }
    }
}