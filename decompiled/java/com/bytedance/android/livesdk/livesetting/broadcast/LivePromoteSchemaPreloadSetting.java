package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_promote_schema_preload_setting")
public final class LivePromoteSchemaPreloadSetting {
    public static final LivePromoteSchemaPreloadSetting INSTANCE = new LivePromoteSchemaPreloadSetting();
    public static final LivePromoteSchemaPreloadConfig DEFAULT = new LivePromoteSchemaPreloadConfig(false, 0);

    public final LivePromoteSchemaPreloadConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePromoteSchemaPreloadConfig livePromoteSchemaPreloadConfig = DEFAULT;
        LivePromoteSchemaPreloadConfig livePromoteSchemaPreloadConfig2 = (LivePromoteSchemaPreloadConfig) settingsManager.getValueSafely("live_promote_schema_preload_setting", livePromoteSchemaPreloadConfig);
        return livePromoteSchemaPreloadConfig2 != null ? livePromoteSchemaPreloadConfig2 : livePromoteSchemaPreloadConfig;
    }
}
