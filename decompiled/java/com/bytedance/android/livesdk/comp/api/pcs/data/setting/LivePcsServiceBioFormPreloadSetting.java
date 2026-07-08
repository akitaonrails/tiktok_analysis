package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_pcs_service_bio_form_preload")
public final class LivePcsServiceBioFormPreloadSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsServiceBioFormPreloadSetting INSTANCE = new LivePcsServiceBioFormPreloadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_service_bio_form_preload", DEFAULT);
    }
}
