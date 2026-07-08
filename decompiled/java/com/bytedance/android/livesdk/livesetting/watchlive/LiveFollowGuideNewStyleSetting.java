package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_follow_guide_opt")
public final class LiveFollowGuideNewStyleSetting {
    public static final int EXPAND_BUTTON = 4;
    public static final int FILL_LAYOUT = 5;
    public static final int NO_FOLLOW_GUIDE = 1;
    public static final int OPTIMIZE_FONT_STYLE = 2;
    public static final int SHAKE_BUTTON = 3;
    public static final LiveFollowGuideNewStyleSetting INSTANCE = new LiveFollowGuideNewStyleSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_follow_guide_opt", DEFAULT);

    public static final boolean applyFollowGuideNewStyle() {
        return value >= 3;
    }

    public static final boolean noFollowGuide() {
        int i = value;
        return i == 1 || i == 2;
    }

    public static final boolean optimizeFontStyle() {
        return value >= 2;
    }

    public final boolean enableNewStrategy() {
        return value > 0;
    }

    public final int getValue() {
        return value;
    }
}
