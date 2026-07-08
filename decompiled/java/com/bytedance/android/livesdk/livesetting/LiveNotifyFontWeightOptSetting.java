package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_notify_font_weight_opt")
public final class LiveNotifyFontWeightOptSetting {
    public static final int ALL = 7;
    public static final int DEFAULT = 0;
    public static final LiveNotifyFontWeightOptSetting INSTANCE = new LiveNotifyFontWeightOptSetting();
    public static final int PUBLIC_SCREEN_BADGE = 2;
    public static final int PUBLIC_SCREEN_MESSAGE = 4;
    public static final int SENIOR_MESSAGE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_notify_font_weight_opt", DEFAULT);
    }

    public final boolean isPublicScreenBadgeFontWeightOpt() {
        return (getValue() & 2) != 0;
    }

    public final boolean isPublicScreenMessageFontWeightOpt() {
        return (getValue() & 4) != 0;
    }

    public final boolean isSeniorMessageFontWeightOpt() {
        return (getValue() & 1) != 0;
    }
}
