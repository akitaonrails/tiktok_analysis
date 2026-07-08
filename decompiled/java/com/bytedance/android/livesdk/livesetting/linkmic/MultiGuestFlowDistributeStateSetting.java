package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_default_distribute_state")
public final class MultiGuestFlowDistributeStateSetting {
    public static final MultiGuestFlowDistributeStateSetting INSTANCE = new MultiGuestFlowDistributeStateSetting();
    public static final int DEFAULT = 4;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_default_distribute_state", DEFAULT);
    }
}
