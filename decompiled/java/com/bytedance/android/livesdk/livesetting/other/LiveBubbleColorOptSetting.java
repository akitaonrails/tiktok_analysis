package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_bubble_color_opt")
public final class LiveBubbleColorOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBubbleColorOptSetting INSTANCE = new LiveBubbleColorOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_bubble_color_opt", DEFAULT);
    }
}
