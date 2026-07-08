package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscription_us_region")
public final class SubUsRegionSetting {
    public static final boolean DEFAULT = false;
    public static final SubUsRegionSetting INSTANCE = new SubUsRegionSetting();
    public static final boolean TRUE = true;

    public final boolean isUsRegion() {
        return SettingsManager.INSTANCE.getBooleanValue("subscription_us_region", DEFAULT);
    }
}
