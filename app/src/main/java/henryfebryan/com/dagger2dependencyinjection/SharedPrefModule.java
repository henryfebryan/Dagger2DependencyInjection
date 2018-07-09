package henryfebryan.com.dagger2dependencyinjection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/*@Module :
This is used on the class that does the work of constructing objects that’ll be eventually provided as dependencies.
 */
@Module
public class SharedPrefModule {
    private Context context;

    public SharedPrefModule(Context context) {
        this.context = context;
    }

    /*
    @Provide : This is used on the methods inside the Module class that’ll return the object.
     */
    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }

    @Singleton
    @Provides
    public SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
