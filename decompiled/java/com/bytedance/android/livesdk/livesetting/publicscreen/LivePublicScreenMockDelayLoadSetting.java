package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_mock_delay_load")
public final class LivePublicScreenMockDelayLoadSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenMockDelayLoadSetting INSTANCE = new LivePublicScreenMockDelayLoadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_mock_delay_load", DEFAULT);
    }
}
