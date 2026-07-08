package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ping_anchor_pause_opt")
public final class PingAnchorPauseOptSetting {
    public static final boolean DEFAULT = false;
    public static final PingAnchorPauseOptSetting INSTANCE = new PingAnchorPauseOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ping_anchor_pause_opt", DEFAULT);
    }
}
