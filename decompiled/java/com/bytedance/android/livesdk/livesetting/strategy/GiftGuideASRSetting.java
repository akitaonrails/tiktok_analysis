package com.bytedance.android.livesdk.livesetting.strategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_asr_exp")
public final class GiftGuideASRSetting {
    public static final GiftGuideASRSetting INSTANCE = new GiftGuideASRSetting();
    public static final GiftGuideASRConfig DEFAULT = new GiftGuideASRConfig();

    public final GiftGuideASRConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftGuideASRConfig giftGuideASRConfig = DEFAULT;
        GiftGuideASRConfig giftGuideASRConfig2 = (GiftGuideASRConfig) settingsManager.getValueSafely("ttlive_asr_exp", giftGuideASRConfig);
        return giftGuideASRConfig2 != null ? giftGuideASRConfig2 : giftGuideASRConfig;
    }

    public final boolean isEnable() {
        return getValue().scene != null;
    }
}
