package appjs.kotlinwithdagger2example

import android.app.Activity
import android.os.Bundle
import android.util.Log
import appjs.kotlinwithdagger2example.injectors.ActivityModule
import appjs.kotlinwithdagger2example.injectors.DaggerActivityComponent
import appjs.kotlinwithdagger2example.manager.DataManager
import javax.inject.Inject

class MainActivity : Activity() {

    private val activityComponent by lazy {
        DaggerActivityComponent.builder()
                .applicationComponent(App.get(this).applicationComponent)
                .activityModule(ActivityModule(this))
                .build()
    }

    @Inject lateinit var mDataManager : DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)
        Log.d(TAG, "onCreate")
        Log.d(TAG, "dataManager is $mDataManager")
    }

    companion object {
        val TAG = "MainActivity"
    }
}