package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = true, value = "ec_enable_brand_enhancement")
public final class LiveTrustInfoPrioritySetting {
    public static final boolean DEFAULT = false;
    public static final LiveTrustInfoPrioritySetting INSTANCE = new LiveTrustInfoPrioritySetting();

    public final boolean isHighPriority() {
        return SettingsManager.INSTANCE.getBooleanValue("ec_enable_brand_enhancement", DEFAULT);
    }
}
