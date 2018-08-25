package com.example.adaog.trabcarros.activity


import kotlinx.android.synthetic.main.activity_carros.*

import android.os.Bundle
import android.widget.TextView

import com.example.adaog.trabcarros.domain.TipoCarro
import com.example.adaog.trabcarros.extensions.setupToolbar
import com.example.adaog.trabcarros.R
class CarrosActivity : BaseActivity() {
    private var tipo: TipoCarro = TipoCarro.Classicos
    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carros)

        setupToolbar(R.id.toolbar)

        this.tipo = intent.getSerializableExtra("tipo") as TipoCarro
        val s = context.getString(tipo.string)

        val text = findViewById<TextView>(R.id.text)
        text.text = "Carros $s"
    }
}