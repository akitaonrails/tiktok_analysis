package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_pcs_preload_pin_card")
public final class LivePcsPreloadPinCardSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsPreloadPinCardSetting INSTANCE = new LivePcsPreloadPinCardSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_preload_pin_card", DEFAULT);
    }
}
