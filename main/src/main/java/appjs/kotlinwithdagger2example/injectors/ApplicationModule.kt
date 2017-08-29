package appjs.kotlinwithdagger2example.injectors

import android.app.Application
import android.content.Context
import appjs.kotlinwithdagger2example.annotations.ApplicationContext
import appjs.kotlinwithdagger2example.annotations.DataBaseInfo
import dagger.Module
import dagger.Provides


@Module
class ApplicationModule (val mApplication: Application) {
    @Provides
    @ApplicationContext
    fun provideContext() : Context = mApplication

    @Provides
    @DataBaseInfo
    fun provideDatabaseName() : String = "kotlinDaggerExample.db"

    @Provides
    @DataBaseInfo
    fun provideDatabaseVersion() : Int = 2
}