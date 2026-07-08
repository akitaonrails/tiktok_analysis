package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_click_wave_schema_setting")
public final class LivePublicScreenClickWaveSchemaSetting {
    public static final LivePublicScreenClickWaveSchemaSetting INSTANCE = new LivePublicScreenClickWaveSchemaSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_public_screen_click_wave_schema_setting", true);

    public final boolean enable() {
        return value;
    }
}
