package appjs.kotlinwithdagger2example.helpers

import android.content.Context
import android.util.Log
import appjs.kotlinwithdagger2example.annotations.ApplicationContext
import appjs.kotlinwithdagger2example.annotations.DataBaseInfo
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
open class DbHelper @Inject constructor(@ApplicationContext context: Context,
                                        @DataBaseInfo val dbName: String,
                                        @DataBaseInfo val dbVersion: Int) {
    private var dbCreated = false

    fun createDbOnce() {
        if (!dbCreated) {
            Log.d(TAG, "Db Created {$dbName,$dbVersion}")
            dbCreated = true
        } else {
            Log.d(TAG, "db already created")
        }
    }

    companion object {
        val TAG = "DbHelper"
    }
}