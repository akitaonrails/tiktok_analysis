package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_dsl_monitor")
public final class LiveSdkMultiGuestDslMonitorSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestDslMonitorSetting INSTANCE = new LiveSdkMultiGuestDslMonitorSetting();
    public static volatile int dslUpdateCount;
    public static volatile boolean hasReported;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_dsl_monitor", DEFAULT);
    }

    public final int getDslUpdateCount() {
        return dslUpdateCount;
    }

    public final boolean getHasReported() {
        return hasReported;
    }

    public final void setDslUpdateCount(int i) {
        dslUpdateCount = i;
    }

    public final void setHasReported(boolean z) {
        hasReported = z;
    }
}
