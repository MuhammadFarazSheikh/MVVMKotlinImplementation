package com.ofsol.mvvmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ofsol.mvvmsample.mvvm.MVVMModel
import java.util.*

class MainActivity : AppCompatActivity(),Observer<Object> {

    private lateinit var mvvmModel: MVVMModel<Object>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setupMvvmModelInstance()
//        setupLiveDataListener()
    }

    /*SETUP MVVM MODEL INSTANCE*/
    private fun setupMvvmModelInstance()
    {
//        mvvmModel = ViewModelProviders.of(this).get(MVVMModel::class.java)
    }

    /*SETUP LIVE DATA LISTENER*/
    private fun setupLiveDataListener()
    {
        mvvmModel.getData().observe(this,this)
    }

    override fun onChanged(t: Object?) {
    }
}
