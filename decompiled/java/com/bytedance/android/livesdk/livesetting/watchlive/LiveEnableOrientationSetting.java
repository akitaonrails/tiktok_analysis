package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_screen_audience_auto_orientation")
public final class LiveEnableOrientationSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final LiveEnableOrientationSetting INSTANCE = new LiveEnableOrientationSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_screen_audience_auto_orientation", DEFAULT) == 1;
    }
}
