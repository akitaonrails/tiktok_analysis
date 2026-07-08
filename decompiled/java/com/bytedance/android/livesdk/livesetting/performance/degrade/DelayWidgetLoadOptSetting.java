package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("delay_widget_load_opt")
public final class DelayWidgetLoadOptSetting {
    public static final DelayWidgetLoadConfig DEFAULT;
    public static final DelayWidgetLoadOptSetting INSTANCE = new DelayWidgetLoadOptSetting();

    static {
        TypeAdapter typeAdapter = DelayWidgetLoadConfig.ADAPTER;
        DEFAULT = new DelayWidgetLoadConfig();
    }

    private final DelayWidgetLoadConfig getDelayWidgetLoadConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DelayWidgetLoadConfig delayWidgetLoadConfig = DEFAULT;
        DelayWidgetLoadConfig delayWidgetLoadConfig2 = (DelayWidgetLoadConfig) settingsManager.getValueSafely("delay_widget_load_opt", delayWidgetLoadConfig);
        return delayWidgetLoadConfig2 != null ? delayWidgetLoadConfig2 : delayWidgetLoadConfig;
    }

    public final long getDelayTimeGiftInMills() {
        return ((long) getDelayWidgetLoadConfig().delayTimeGiftInSecond) * 1000;
    }

    public final long getDelayTimeInMills() {
        return ((long) getDelayWidgetLoadConfig().delayTimeInSecond) * 1000;
    }

    public final long getDelayTimeLikeInMills() {
        return ((long) getDelayWidgetLoadConfig().delayTimeLikeInSecond) * 1000;
    }

    public final boolean getEnableDelay() {
        return getDelayWidgetLoadConfig().enableDelay;
    }
}
