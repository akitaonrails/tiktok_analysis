package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_linkmic_showdown_animation_performance_opt")
public final class MultiGuestV3ShowdownAnimationPerformanceOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3ShowdownAnimationPerformanceOptSetting INSTANCE = new MultiGuestV3ShowdownAnimationPerformanceOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_linkmic_showdown_animation_performance_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
