package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_must_bubble_optimize_android")
public final class LiveMustBubbleOptimizeAndroidSetting {
    public static final int DEFAULT = 0;
    public static final LiveMustBubbleOptimizeAndroidSetting INSTANCE = new LiveMustBubbleOptimizeAndroidSetting();
    public static final int OPT_USE_SCENE = 1;
    public static final int OPT_USE_PRIORITY = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_must_bubble_optimize_android", DEFAULT);
    }
}
