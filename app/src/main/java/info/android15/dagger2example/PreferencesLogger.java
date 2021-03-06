package info.android15.dagger2example;

import android.content.SharedPreferences;
import android.util.Log;

import java.util.Map;

import javax.inject.Inject;

public class PreferencesLogger {

    @Inject SharedPreferences pref;

    @Inject
    public PreferencesLogger() {
    }

    public void log() {
        Log.v(getClass().getSimpleName(), "Logging all preferences:");

        for (Map.Entry<String, ?> entry : pref.getAll().entrySet())
            Log.v(getClass().getSimpleName(), entry.getKey() + " = " + entry.getValue());
    }
}
