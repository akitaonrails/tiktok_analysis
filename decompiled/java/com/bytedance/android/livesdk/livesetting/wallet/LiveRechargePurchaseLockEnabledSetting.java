package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_recharge_purchase_lock")
public final class LiveRechargePurchaseLockEnabledSetting {
    public static final LiveRechargePurchaseLockEnabledSetting INSTANCE = new LiveRechargePurchaseLockEnabledSetting();
    public static final Config DEFAULT = new Config();

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRechargePurchaseLockEnabledSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("ttl_ms")
        public int ttlMs = 10000;
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_recharge_purchase_lock", config);
        return config2 != null ? config2 : config;
    }

    public final boolean isEnabled() {
        return getValue().enable;
    }

    public final long ttlMs() {
        int i = getValue().ttlMs;
        if (i < 0) {
            i = 0;
        }
        return i;
    }
}
