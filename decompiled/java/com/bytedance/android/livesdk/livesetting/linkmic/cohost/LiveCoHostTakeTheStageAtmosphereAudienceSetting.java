package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_stage_enhance_competitive_atmosphere_audience_enable")
public final class LiveCoHostTakeTheStageAtmosphereAudienceSetting {
    public static final LiveCoHostTakeTheStageAtmosphereAudienceSetting INSTANCE = new LiveCoHostTakeTheStageAtmosphereAudienceSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_stage_enhance_competitive_atmosphere_audience_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
