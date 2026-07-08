package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_recharge_debounce_click_enabled")
public final class LiveRechargeDebounceClickEnabledSetting {
    public static final LiveRechargeDebounceClickEnabledSetting INSTANCE = new LiveRechargeDebounceClickEnabledSetting();
    public static final Config DEFAULT = new Config();

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRechargeDebounceClickEnabledSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("debounce_time_ms")
        public int debounceTimeMs = 500;

        @C09CT("enable")
        public boolean enable;
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_recharge_debounce_click_enabled", config);
        return config2 != null ? config2 : config;
    }

    public final long debounceTimeMs() {
        int i = getValue().debounceTimeMs;
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public final boolean isEnabled() {
        return getValue().enable;
    }
}
