package appjs.kotlinwithdagger2example.manager

import android.content.Context
import appjs.kotlinwithdagger2example.annotations.ApplicationContext
import appjs.kotlinwithdagger2example.helpers.DbHelper
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
open class DataManager @Inject constructor(@ApplicationContext val mContext: Context,
                                           val mDbHelper: DbHelper)