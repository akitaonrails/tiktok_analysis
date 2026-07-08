package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_background_color_audience_enable_setting")
public final class LiveCohostBgColorAudienceSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostBgColorAudienceSetting INSTANCE = new LiveCohostBgColorAudienceSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_background_color_audience_enable_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
