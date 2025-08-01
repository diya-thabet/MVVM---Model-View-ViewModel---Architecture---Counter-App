package com.fennec.mvvmcounter

data class CounterModel(var count: Int)

class CounterRepository{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun increment(){
        this._counter.count++
    }

    fun decrement(){
        this._counter.count--
    }

}