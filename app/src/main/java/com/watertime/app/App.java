package com.watertime.app;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.push.YandexMetricaPush;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        YandexMetricaConfig config = YandexMetricaConfig.newConfigBuilder("f840ff29-a95f-4b32-918f-a663c88cf614").build();
        YandexMetrica.activate(getApplicationContext(), config);
        YandexMetrica.enableActivityAutoTracking(this);
        YandexMetricaPush.init(getApplicationContext());
    }
}