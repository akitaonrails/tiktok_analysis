package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_limit_dsl_update")
public final class LiveSdkMultiGuestLimitDslUpdateSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestLimitDslUpdateSetting INSTANCE = new LiveSdkMultiGuestLimitDslUpdateSetting();
    public static volatile int dslUpdateCount;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_limit_dsl_update", DEFAULT);
    }

    public final int getDslUpdateCount() {
        return dslUpdateCount;
    }

    public final void setDslUpdateCount(int i) {
        dslUpdateCount = i;
    }
}
