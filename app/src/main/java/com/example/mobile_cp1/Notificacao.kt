package com.example.mobile_cp1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobile_cp1.databinding.ActivityMainBinding
import com.example.mobile_cp1.databinding.ActivityNotificacaoBinding

class Notificacao : AppCompatActivity() {
    private  lateinit var binding: ActivityNotificacaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificacaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icHome.setOnClickListener{
            val IrHome = Intent(this,MainActivity::class.java)
            startActivity(IrHome)
        }

        binding.icSearch.setOnClickListener{
            val irSearch = Intent(this,TerceiraTela::class.java)
            startActivity(irSearch)
        }
    }
}