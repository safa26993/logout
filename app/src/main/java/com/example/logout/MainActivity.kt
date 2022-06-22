package com.example.logout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.DialogInterface
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    private val alertDialog: AlertDialog? = null
    private val builder: AlertDialog.Builder? = null
    private var Logout: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logout = findViewById<View>(R.id.logout) as Button
        Logout!!.setOnClickListener {
            val MyDialog = AlertDialog.Builder(this)
            builder!!.setIcon(R.drawable.ic_baseline_exit_to_app_24)
            builder.setTitle("Confirmer")
            builder.setMessage("Voulez-vous quitter l'application")
            builder.setCancelable(true)
            builder.setPositiveButton("Oui") { dialog, which ->
               // FirebaseAuth.getInstance().signOut()
                startActivity(Intent(this, MainActivity2::class.java))
            }
            builder.setNegativeButton("Non") { dialog, which -> alertDialog!!.cancel() }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}