package com.example.launchmodes_demo.launchModeDemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.launchmodes_demo.databinding.ActivityAaBinding

class Activity_aa : AppCompatActivity() {

    private lateinit var binding : ActivityAaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        StackRegistry.addActivity(javaClass.simpleName)
        binding.currentActivity.text = StackRegistry.getStackAsString()


        binding.ActivityA.setOnClickListener {
            Intent(
                this,
                Activity_aa::class.java
            ).also { startActivity(it) }
        }

        binding.ActivityB.setOnClickListener {
            Intent(
                this,
                Activity_bb::class.java
            ).also { startActivity(it) }
        }

        binding.ActivityC.setOnClickListener {
            Intent(
                this,
                Activity_cc::class.java
            ).also { startActivity(it) }
        }

        binding.ActivityD.setOnClickListener {
            Intent(
                this,
                Activity_dd::class.java
            ).also { startActivity(it) }
        }






    }


    override fun onDestroy() {
        super.onDestroy()

        StackRegistry.removeActivity(javaClass.simpleName)

    }
}