package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_takestage_experience_opt_extra")
public final class LiveMatchTakeStageOptExtraSetting {
    public static final LiveMatchTakeStageOptExtraSetting INSTANCE = new LiveMatchTakeStageOptExtraSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_takestage_experience_opt_extra", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() > 0 && LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptRedundantApi();
    }
}
