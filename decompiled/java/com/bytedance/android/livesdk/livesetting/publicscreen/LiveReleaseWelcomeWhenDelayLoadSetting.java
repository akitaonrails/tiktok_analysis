package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_release_welcome_when_delay_load")
public final class LiveReleaseWelcomeWhenDelayLoadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveReleaseWelcomeWhenDelayLoadSetting INSTANCE = new LiveReleaseWelcomeWhenDelayLoadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_release_welcome_when_delay_load", DEFAULT);
    }
}
