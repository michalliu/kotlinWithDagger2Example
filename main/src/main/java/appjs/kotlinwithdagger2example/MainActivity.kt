package appjs.kotlinwithdagger2example

import android.app.Activity
import android.os.Bundle
import android.util.Log
import appjs.kotlinwithdagger2example.manager.DataManager
import javax.inject.Inject

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    companion object {
        val TAG = "MainActivity"
    }
}