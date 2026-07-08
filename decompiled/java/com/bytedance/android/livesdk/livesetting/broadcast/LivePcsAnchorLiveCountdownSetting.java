package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_anchor_live_countdown")
public final class LivePcsAnchorLiveCountdownSetting {
    public static final int DEFAULT = 3;
    public static final LivePcsAnchorLiveCountdownSetting INSTANCE = new LivePcsAnchorLiveCountdownSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_anchor_live_countdown", DEFAULT);
    }
}
