package com.bytedance.android.livesdk.livesetting.goodybag;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_goody_bag_audience_enable")
public final class GoodyBagFeatureAudienceSetting {
    public static final boolean DEFAULT = false;
    public static final GoodyBagFeatureAudienceSetting INSTANCE = new GoodyBagFeatureAudienceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_goody_bag_audience_enable", DEFAULT);
    }
}
