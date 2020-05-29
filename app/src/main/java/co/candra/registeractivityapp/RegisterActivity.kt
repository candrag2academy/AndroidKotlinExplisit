package co.candra.registeractivityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        onClickGroup()
    }
    fun onClickGroup(){
        email_sign_in_button.setOnClickListener(){
            Toast.makeText(this, "Terima kasih telah reggister", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
