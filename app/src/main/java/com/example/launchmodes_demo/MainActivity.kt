package com.example.launchmodes_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.launchmodes_demo.databinding.ActivityMainBinding
import com.example.launchmodes_demo.launchModeDemo.Activity_aa
import com.example.launchmodes_demo.launchModeDemo.Activity_bb
import com.example.launchmodes_demo.launchModeDemo.Activity_cc
import com.example.launchmodes_demo.launchModeDemo.Activity_dd
import com.example.launchmodes_demo.launchModeDemo.StackRegistry

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
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
}