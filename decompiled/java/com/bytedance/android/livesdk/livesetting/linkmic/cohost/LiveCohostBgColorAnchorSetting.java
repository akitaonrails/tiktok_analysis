package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_background_color_anchor_setting")
public final class LiveCohostBgColorAnchorSetting {
    public static final String DEFAULT = "#FF000000";
    public static final LiveCohostBgColorAnchorSetting INSTANCE = new LiveCohostBgColorAnchorSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_cohost_background_color_anchor_setting", DEFAULT);
    }
}
