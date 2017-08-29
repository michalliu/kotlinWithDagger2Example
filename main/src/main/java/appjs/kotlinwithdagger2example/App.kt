package appjs.kotlinwithdagger2example

import android.app.Application
import android.content.Context
import android.util.Log
import appjs.kotlinwithdagger2example.injectors.ApplicationComponent
import appjs.kotlinwithdagger2example.injectors.ApplicationModule
import appjs.kotlinwithdagger2example.injectors.DaggerApplicationComponent
import appjs.kotlinwithdagger2example.manager.DataManager
import javax.inject.Inject

class App : Application() {
    lateinit var applicationComponent : ApplicationComponent

    @Inject
    lateinit var mDataManager : DataManager

    override fun onCreate() {
        Log.d(TAG, "onCreate")
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
        applicationComponent.inject(this)
        Log.d(TAG, "DataManager is $mDataManager")
    }
    companion object {
        val TAG = "App"
        fun get(context : Context) : App {
            return context.applicationContext as App
        }
    }
}