package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_video_dyna_perf_score_opt")
public final class LiveGiftVideoDynaPerfScoreOptSetting {
    public static final LiveGiftVideoDynaPerfScoreOptSetting INSTANCE = new LiveGiftVideoDynaPerfScoreOptSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_video_dyna_perf_score_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
