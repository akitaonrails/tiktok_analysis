package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_donation_optimize")
public final class LiveDonationOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveDonationOptSetting INSTANCE = new LiveDonationOptSetting();

    public final int abKey() {
        return SettingsManager.INSTANCE.getIntValue("tiktok_live_donation_optimize", DEFAULT);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("tiktok_live_donation_optimize", DEFAULT) > 0;
    }
}
