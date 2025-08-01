package com.fennec.mvvmcounter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _repository : CounterRepository = CounterRepository()
    private val _counter = mutableIntStateOf(_repository.getCounter().count)

    val count : MutableState<Int> = _counter


    fun increment(){
        _repository.increment()
        _counter.intValue= _repository.getCounter().count
    }

    fun decrement(){
        _repository.decrement()
        _counter.intValue= _repository.getCounter().count
    }


}