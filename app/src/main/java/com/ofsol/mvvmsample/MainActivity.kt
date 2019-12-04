package com.ofsol.mvvmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ofsol.mvvmsample.mvvm.MVVMModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Observer<String> {

    private lateinit var mvvmModel: MVVMModel<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupMvvmModelInstance()
        setupLiveDataListener()
    }

    /*SETUP MVVM MODEL INSTANCE FOR MAKING IT GENERIC IN KOTLIN*/
    private fun setupMvvmModelInstance()
    {
        mvvmModel = ViewModelProviders.of(this).get(MVVMModel<String>()::class.java)
    }

    /*SETUP LIVE DATA LISTENER*/
    private fun setupLiveDataListener()
    {
        mvvmModel.getData().observe(this,this)
        mvvmModel.getSampleData()
    }

    override fun onChanged(t: String?) {
        tvLable.text = t
    }
}
