package com.example.listsetmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array = arrayOf(1, 2)

        var arrayList = arrayListOf<Int>(1, 2, 3)

        val list = listOf<Int>(1, 2)
        var list2 = mutableListOf<Int>(1, 2)

        val set = setOf<Int>(1, 2)
        var set2 = mutableSetOf<Int>(1, 2)

        val map = mapOf<String, Int>("mot" to 1)
        var map2 = mutableMapOf<String, Int>("mot" to 1)

        list2.map { it ->
            it + 2
        }

        list2.filter {
            it == 1
        }

        map.filterKeys {
            it == "mot"
        }
    }
}