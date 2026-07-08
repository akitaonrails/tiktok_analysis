package com.bytedance.android.livesdk.livesetting.strategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_asr_exp_audience")
public final class GiftGuideASRSettingAudience {
    public static final boolean DEFAULT = false;
    public static final GiftGuideASRSettingAudience INSTANCE = new GiftGuideASRSettingAudience();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_asr_exp_audience", DEFAULT);
    }
}
