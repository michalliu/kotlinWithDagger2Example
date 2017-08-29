package appjs.kotlinwithdagger2example.helpers

import android.content.Context
import appjs.kotlinwithdagger2example.annotations.ApplicationContext
import appjs.kotlinwithdagger2example.annotations.DataBaseInfo
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
open class DbHelper @Inject constructor(@ApplicationContext context: Context,
                                        @DataBaseInfo dbName: String,
                                        @DataBaseInfo dbVersion: Int)