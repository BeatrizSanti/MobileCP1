package com.example.mobile_cp1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobile_cp1.databinding.ActivityNotificacaoBinding
import com.example.mobile_cp1.databinding.ActivityTerceiraTelaBinding

class TerceiraTela : AppCompatActivity() {
    private  lateinit var binding: ActivityTerceiraTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceiraTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icHome.setOnClickListener{
            val IrHome = Intent(this,MainActivity::class.java)
            startActivity(IrHome)
        }

        binding.icNoti.setOnClickListener{
            val irNot = Intent(this,Notificacao::class.java)
            startActivity(irNot)
        }
    }
}