package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_v3_audience_enable")
public final class LiveCoHostTakeTheStageAudienceV3Setting {
    public static final LiveCoHostTakeTheStageAudienceV3Setting INSTANCE = new LiveCoHostTakeTheStageAudienceV3Setting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_the_stage_v3_audience_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
