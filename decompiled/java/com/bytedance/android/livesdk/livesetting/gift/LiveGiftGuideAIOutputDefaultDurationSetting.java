package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_guide_ai_output_default_duration")
public final class LiveGiftGuideAIOutputDefaultDurationSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGiftGuideAIOutputDefaultDurationSetting INSTANCE = new LiveGiftGuideAIOutputDefaultDurationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_guide_ai_output_default_duration", DEFAULT);
    }
}
