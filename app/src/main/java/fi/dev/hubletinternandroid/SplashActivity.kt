package fi.dev.hubletinternandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {


    private var btnSignIn: Button? = null
    private var txtCreateAccount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        btnSignIn = findViewById(R.id.btn_sign_in)
        txtCreateAccount = findViewById(R.id.txt_create_account)

        btnSignIn?.setOnClickListener {
            Toast.makeText(this, "Sign in", Toast.LENGTH_SHORT).show()
        }

        txtCreateAccount?.setOnClickListener {
            Toast.makeText(this, "Create account", Toast.LENGTH_SHORT).show()
        }

        Log.d(TAG, "onCreate")
    }

    override fun onResume() {
        super.onResume()

    }

    companion object {
        const val TAG = "HIAMainActivity"
    }

}