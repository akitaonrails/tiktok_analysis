package com.bytedance.android.livesdk.workaround;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_black_screen_fix_exp")
public final class LiveInnerBlackScreenFixExp {
    public static final int DEFAULT = 0;
    public static final LiveInnerBlackScreenFixExp INSTANCE = new LiveInnerBlackScreenFixExp();

    public final int getFixType() {
        return SettingsManager.INSTANCE.getIntValue("live_inner_black_screen_fix_exp", DEFAULT);
    }
}
