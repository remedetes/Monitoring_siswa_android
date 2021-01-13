package com.example.testingskripsinew.user

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.testingskripsinew.HistoryUser
import com.example.testingskripsinew.ViewMapsActivity
import com.example.testingskripsinew.databinding.ActivityMainUserBinding
import com.example.testingskripsinew.utils.Data

class MainActivityUser : AppCompatActivity() {
    private lateinit var binding: ActivityMainUserBinding
    private lateinit var inUser: String
    private lateinit var inNpm: String

    companion object {
        const val EXTRA_USER = "data_user"
        const val EXTRA_NPM = "data_npm"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        inUser = intent.getStringExtra(EXTRA_USER).toString()
        inNpm = intent.getStringExtra(EXTRA_NPM).toString()

        binding.namaUser.text = inUser
    }

    fun btnPresensiPribadi(view: View?) {
        val i = Intent(this, ViewMapsActivity::class.java)
        this.startActivity(i)
    }

    fun btnHistoryPribadi(view: View?) {
        val i = Intent(this, HistoryUser::class.java)
        this.startActivity(i)
    }

    fun btnProfilPribadi(view: View?) {
        val i = Intent(this, ProfilUser::class.java)
        this.startActivity(i)
        Data.namaUser = inUser
        Data.npmUser = inNpm
    }
}