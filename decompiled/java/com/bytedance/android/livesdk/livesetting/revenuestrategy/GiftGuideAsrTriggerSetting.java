package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_guide_asr_trigger_setting")
public final class GiftGuideAsrTriggerSetting {
    public static final boolean DEFAULT = false;
    public static final GiftGuideAsrTriggerSetting INSTANCE = new GiftGuideAsrTriggerSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("gift_guide_asr_trigger_setting", DEFAULT);
    }
}
