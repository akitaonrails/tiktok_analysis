package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_m2_turn_off_subscription")
public final class LivePcsTurnOffSubSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsTurnOffSubSetting INSTANCE = new LivePcsTurnOffSubSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePcsTurnOffSubSetting.class);
    }

    public static final boolean turnOffSub() {
        return INSTANCE.getValue();
    }
}
