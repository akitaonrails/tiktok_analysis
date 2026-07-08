package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_event_sender")
public final class LiveCoHostEventSenderSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostEventSenderSetting INSTANCE = new LiveCoHostEventSenderSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_event_sender", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
