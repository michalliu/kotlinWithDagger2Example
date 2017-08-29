package appjs.kotlinwithdagger2example.injectors

import appjs.kotlinwithdagger2example.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(app: App)
}