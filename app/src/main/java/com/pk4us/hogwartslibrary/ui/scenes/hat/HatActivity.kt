package com.pk4us.hogwartslibrary.ui.scenes.hat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.pk4us.hogwartslibrary.R

class HatActivity : AppCompatActivity() {

    private lateinit var hatViewModel: HatViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hat)

        hatViewModel = ViewModelProviders.of(this)[HatViewModel::class.java]
    }
}