package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("gifting_sound_feedback")
public final class LiveGiftGiftingSoundFeedbackSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftGiftingSoundFeedbackSetting INSTANCE = new LiveGiftGiftingSoundFeedbackSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("gifting_sound_feedback", DEFAULT);
    }
}
