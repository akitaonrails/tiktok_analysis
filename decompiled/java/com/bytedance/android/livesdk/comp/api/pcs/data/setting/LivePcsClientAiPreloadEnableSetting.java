package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_client_ai_preload_enable")
public final class LivePcsClientAiPreloadEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsClientAiPreloadEnableSetting INSTANCE = new LivePcsClientAiPreloadEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_client_ai_preload_enable", DEFAULT);
    }
}
