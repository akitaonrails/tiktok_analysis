package com.bytedance.android.livesdk.workaround;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_fix_scroll_black_exp")
public final class LiveFixScrollBlackExp {
    public static final boolean DEFAULT = false;
    public static final LiveFixScrollBlackExp INSTANCE = new LiveFixScrollBlackExp();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fix_scroll_black_exp", DEFAULT);
    }
}
