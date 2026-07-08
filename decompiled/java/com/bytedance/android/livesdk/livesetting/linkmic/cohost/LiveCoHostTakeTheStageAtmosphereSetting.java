package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_stage_enhance_competitive_atmosphere_enable")
public final class LiveCoHostTakeTheStageAtmosphereSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostTakeTheStageAtmosphereSetting INSTANCE = new LiveCoHostTakeTheStageAtmosphereSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_stage_enhance_competitive_atmosphere_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
