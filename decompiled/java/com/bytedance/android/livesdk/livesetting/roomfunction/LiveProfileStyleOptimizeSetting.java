package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_user_preview_ui_opt")
public final class LiveProfileStyleOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE_ALL = 3;
    public static final int ENABLE_SLIDE = 2;
    public static final int ENABLE_STYLE = 1;
    public static final LiveProfileStyleOptimizeSetting INSTANCE;
    public static final int enable;

    public static /* synthetic */ void getEnable$annotations() {
    }

    static {
        LiveProfileStyleOptimizeSetting liveProfileStyleOptimizeSetting = new LiveProfileStyleOptimizeSetting();
        INSTANCE = liveProfileStyleOptimizeSetting;
        enable = liveProfileStyleOptimizeSetting.getValue();
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_user_preview_ui_opt", DEFAULT);
    }

    public final boolean isNewStyleEnable() {
        return (getValue() & 1) == 1;
    }

    public final boolean isSlideEnable() {
        return (getValue() & 2) == 2;
    }

    public static final int getEnable() {
        return enable;
    }
}
