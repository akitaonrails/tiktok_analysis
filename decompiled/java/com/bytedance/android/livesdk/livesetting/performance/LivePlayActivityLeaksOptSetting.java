package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_play_activity_leaks_opt")
public final class LivePlayActivityLeaksOptSetting {
    public static final int DEFAULT = 0;
    public static final LivePlayActivityLeaksOptSetting INSTANCE = new LivePlayActivityLeaksOptSetting();
    public static int value = -1;

    public static final boolean enableDataChannelLeakOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_play_activity_leaks_opt", DEFAULT);
        }
        return (value & 1) == 1;
    }

    public static final boolean enableGiftCountDownViewLeakOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_play_activity_leaks_opt", DEFAULT);
        }
        return (value & 2) == 2;
    }

    public static final boolean enableToolbarShareBehaviorLeakOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_play_activity_leaks_opt", DEFAULT);
        }
        return (value & 4) == 4;
    }
}
