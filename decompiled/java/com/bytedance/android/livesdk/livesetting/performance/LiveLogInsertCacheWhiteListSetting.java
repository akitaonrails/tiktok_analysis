package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("app_log_insert_cache_config")
public final class LiveLogInsertCacheWhiteListSetting {
    public static final AppLogCacheConfig DEFAULT;
    public static final LiveLogInsertCacheWhiteListSetting INSTANCE = new LiveLogInsertCacheWhiteListSetting();
    public static final AppLogCacheConfig value;

    static {
        AppLogCacheConfig appLogCacheConfig = new AppLogCacheConfig();
        DEFAULT = appLogCacheConfig;
        AppLogCacheConfig appLogCacheConfig2 = (AppLogCacheConfig) SettingsManager.INSTANCE.getValueSafely("app_log_insert_cache_config", appLogCacheConfig);
        if (appLogCacheConfig2 != null) {
            appLogCacheConfig = appLogCacheConfig2;
        }
        value = appLogCacheConfig;
    }

    public final AppLogCacheConfig getValue() {
        return value;
    }
}
