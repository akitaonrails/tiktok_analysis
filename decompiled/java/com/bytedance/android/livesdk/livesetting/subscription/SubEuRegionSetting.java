package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscription_europe_region")
public final class SubEuRegionSetting {
    public static final boolean DEFAULT = false;
    public static final SubEuRegionSetting INSTANCE = new SubEuRegionSetting();
    public static final boolean TRUE = true;

    public final boolean isEuRegion() {
        return SettingsManager.INSTANCE.getBooleanValue("subscription_europe_region", DEFAULT);
    }
}
