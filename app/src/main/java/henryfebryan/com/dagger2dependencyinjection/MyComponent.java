package henryfebryan.com.dagger2dependencyinjection;

import javax.inject.Singleton;
import dagger.Component;

/*
@Singleton : This indicates that only a single instance of the dependency object would be created.
@Component : The Module class doesn’t provide the dependency directly to the class that’s requesting it.
 For this a Component interface is used that acts like a bridge between @Module and @Inject.
 */
@Singleton
@Component(modules = {SharedPrefModule.class})//All the modules are mentioned inside the @Component annotation.
public interface MyComponent {
    /*
    The activities, services, or fragments that are allowed to request the dependencies declared by
     the modules (using @Inject) should be declared in this interface with individual inject() methods.
     */
    void inject(MainActivity activity);
}
