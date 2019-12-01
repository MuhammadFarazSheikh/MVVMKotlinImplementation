package com.ofsol.mvvmsample.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MVVMModel<T>:ViewModel
{
    private lateinit var mutableLiveData:MutableLiveData<T>

    constructor()
    {
        mutableLiveData = MutableLiveData()
    }

    /*GET LIVE DATA FROM API CALL OR BY ANY WAY USING GENERIC TYPES*/
    public fun getData():MutableLiveData<T>
    {
        return mutableLiveData
    }

    /*GET SAMPLE DATA*/
    /*IF GETTING DATA FROM SEPERATE THREAD CALL POST METHOD OF MUTABLE LIVE DATA OTHERWISE CALL SET METHOD*/
    public fun getSampleData()
    {
        mutableLiveData.value = "MVVM SAMPLE APP" as T;
    }
}
