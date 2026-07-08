package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_optimize_guest_distribute_state")
public final class MultiGuestOptGuestDistributeStateSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestOptGuestDistributeStateSetting INSTANCE = new MultiGuestOptGuestDistributeStateSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_optimize_guest_distribute_state", DEFAULT);
    }
}
