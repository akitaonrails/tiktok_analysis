package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_co_host_capsule_message_filter_verify")
public final class LiveCoHostCapsuleMessageFilterVerifySetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostCapsuleMessageFilterVerifySetting INSTANCE = new LiveCoHostCapsuleMessageFilterVerifySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_co_host_capsule_message_filter_verify", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
