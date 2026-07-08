package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_background_color_audience_anchor_version_setting")
public final class LiveCohostBgColorAudienceAnchorVersionSetting {
    public static final int DEFAULT = 3380;
    public static final LiveCohostBgColorAudienceAnchorVersionSetting INSTANCE = new LiveCohostBgColorAudienceAnchorVersionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_background_color_audience_anchor_version_setting", DEFAULT);
    }
}
