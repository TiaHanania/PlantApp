package com.example.flowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        menuInflater.inflate(R.menu.pick, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.pflower -> {
                val pickDialogFragment = PickDialog()
                pickDialogFragment.show(supportFragmentManager, "pickDialog")
                return true
            }
          /*  R.id.ptree -> {
                val treeDialogFragment = TreeDialog()
                treeDialogFragment.show(supportFragmentManager, "treeDialog")
                return true
            }*/
            else -> return super.onOptionsItemSelected(item)
        }
    }
}