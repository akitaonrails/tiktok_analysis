package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_background_color_audience_enable_top_setting")
public final class LiveCohostBgColorAudienceTopSetting {
    public static final int DEFAULT = 1;
    public static final LiveCohostBgColorAudienceTopSetting INSTANCE = new LiveCohostBgColorAudienceTopSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_background_color_audience_enable_top_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
