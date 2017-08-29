package appjs.kotlinwithdagger2example.injectors

import android.app.Activity
import android.content.Context
import appjs.kotlinwithdagger2example.annotations.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by leoliu on 17/8/29.
 */
@Module
class ActivityModule(val mActivity : Activity){
    @Provides
    @ActivityContext
    fun provideContext() : Context = mActivity

    @Provides
    fun provideActivity() : Activity = mActivity
}