package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_takestage_audience_cover_rect")
public final class LiveCoHostTakeStageAudienceCoverRectSetting {
    public static final LiveCoHostTakeStageAudienceCoverRectSetting INSTANCE = new LiveCoHostTakeStageAudienceCoverRectSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_takestage_audience_cover_rect", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
