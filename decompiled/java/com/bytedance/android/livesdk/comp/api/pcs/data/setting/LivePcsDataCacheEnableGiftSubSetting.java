package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_psc_data_cache_enable_gift_sub")
public final class LivePcsDataCacheEnableGiftSubSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsDataCacheEnableGiftSubSetting INSTANCE = new LivePcsDataCacheEnableGiftSubSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_psc_data_cache_enable_gift_sub", DEFAULT);
    }
}
