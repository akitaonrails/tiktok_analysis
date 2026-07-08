package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_quick_pair_cancel_time")
public final class LiveCohostQuickPairCancelTimeSetting {
    public static final int DEFAULT = 30;
    public static final LiveCohostQuickPairCancelTimeSetting INSTANCE = new LiveCohostQuickPairCancelTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_quick_pair_cancel_time", DEFAULT);
    }
}
