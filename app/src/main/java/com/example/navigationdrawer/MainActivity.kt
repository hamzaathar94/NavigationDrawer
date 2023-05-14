package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    private var drawerlayout:DrawerLayout?=null
    private var actionBarDrawerToggle:ActionBarDrawerToggle?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        drawerlayout=binding?.drawer

        binding.apply {
            actionBarDrawerToggle=ActionBarDrawerToggle(this@MainActivity,drawerlayout,R.string.nav_open,R.string.nav_close)
            drawerlayout?.addDrawerListener(actionBarDrawerToggle!!)
            actionBarDrawerToggle?.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle?.onOptionsItemSelected(item)==true){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}