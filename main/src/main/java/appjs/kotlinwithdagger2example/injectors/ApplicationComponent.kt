package appjs.kotlinwithdagger2example.injectors

import android.content.Context
import appjs.kotlinwithdagger2example.App
import appjs.kotlinwithdagger2example.annotations.ApplicationContext
import appjs.kotlinwithdagger2example.manager.DataManager
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(app: App)

    // provides instances who depends on ApplicationComponent
    // without this method dataManager can not be used in other component
    fun getDataManager() : DataManager
}