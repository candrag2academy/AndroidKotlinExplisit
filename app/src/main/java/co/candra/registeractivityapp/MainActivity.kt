package co.candra.registeractivityapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickGroup()
    }

    fun onClickGroup() {
        loginButton.setOnClickListener(View.OnClickListener {
            if (passwordEditText.getText().toString() == "rahasia") {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com")
                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Password salah", Toast.LENGTH_SHORT).show()
            }
        })
        registerButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}
