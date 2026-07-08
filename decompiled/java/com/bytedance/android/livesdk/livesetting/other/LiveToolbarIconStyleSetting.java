package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_icon_style")
public final class LiveToolbarIconStyleSetting {
    public static final int COLORFUL_WITHOUT_TEXT = 34;
    public static final int COLORFUL_WITH_TEXT = 18;
    public static final int GRAY_WITHOUT_TEXT = 33;
    public static final int GRAY_WITH_TEXT = 17;
    public static final int HIGHLIGHT_WITHOUT_TEXT = 36;
    public static final int HIGHLIGHT_WITH_TEXT = 20;
    public static final LiveToolbarIconStyleSetting INSTANCE = new LiveToolbarIconStyleSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_toolbar_icon_style", DEFAULT);

    public final boolean isColorfulStyle() {
        return (value & 2) != 0;
    }

    public final boolean isGrayStyle() {
        return (value & 1) != 0;
    }

    public final boolean isHighlightStyle() {
        return (value & 4) != 0;
    }

    public final boolean noText() {
        return (value & 32) != 0;
    }

    public final int getValue() {
        return value;
    }
}
