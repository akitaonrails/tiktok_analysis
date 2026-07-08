package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_chat_holder_cache_config")
public final class LivePublicScreenChatHolderCacheConfigSetting {
    public static final LivePublicScreenChatHolderCacheConfigSetting INSTANCE = new LivePublicScreenChatHolderCacheConfigSetting();
    public static final Config DEFAULT = new Config();

    public static final boolean enableLog() {
        return INSTANCE.getValue().enableLog;
    }

    public static final int getCacheSize() {
        return INSTANCE.getValue().chatCacheSize;
    }

    private final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_public_screen_chat_holder_cache_config", config);
        return config2 != null ? config2 : config;
    }
}
