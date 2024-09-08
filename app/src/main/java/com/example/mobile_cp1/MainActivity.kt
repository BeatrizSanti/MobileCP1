package com.example.mobile_cp1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobile_cp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icNoti.setOnClickListener{
            val irNot = Intent(this,Notificacao::class.java)
            startActivity(irNot)
        }


        binding.icSearch.setOnClickListener{
            val irSearch = Intent(this,TerceiraTela::class.java)
            startActivity(irSearch)
        }

    }
}