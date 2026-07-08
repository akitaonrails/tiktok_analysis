package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_background_color_anchor_enable_setting")
public final class LiveCohostBgColorAnchorEnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostBgColorAnchorEnableSetting INSTANCE = new LiveCohostBgColorAnchorEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_background_color_anchor_enable_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
