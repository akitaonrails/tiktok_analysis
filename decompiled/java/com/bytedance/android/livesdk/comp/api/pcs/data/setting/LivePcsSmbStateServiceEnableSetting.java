package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "pcs_foundation_service_enable")
public final class LivePcsSmbStateServiceEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsSmbStateServiceEnableSetting INSTANCE = new LivePcsSmbStateServiceEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("pcs_foundation_service_enable", DEFAULT);
    }
}
