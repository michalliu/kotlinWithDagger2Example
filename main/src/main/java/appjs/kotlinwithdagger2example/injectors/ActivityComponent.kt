package appjs.kotlinwithdagger2example.injectors

import appjs.kotlinwithdagger2example.MainActivity
import appjs.kotlinwithdagger2example.annotations.PerActivity
import dagger.Component

@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(activity: MainActivity)
}