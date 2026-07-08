package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_play_thread_reuse_opt")
public final class LivePlayThreadReuseOptSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE_REUSE_OPT = 1;
    public static final LivePlayThreadReuseOptSetting INSTANCE = new LivePlayThreadReuseOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_play_thread_reuse_opt", DEFAULT);
    }

    public final boolean enableReuseOpt() {
        return getValue() == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
