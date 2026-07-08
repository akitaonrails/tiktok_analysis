package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_multi_guest_simulcast")
public final class LivesdkMultiGuestSimulcastSetting {
    public static final boolean DEFAULT = false;
    public static final LivesdkMultiGuestSimulcastSetting INSTANCE = new LivesdkMultiGuestSimulcastSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_multi_guest_simulcast", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
