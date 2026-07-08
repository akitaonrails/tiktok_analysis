package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_user_journey_step_size_limit")
public final class LiveGiftUserJourneyStepSizeLimitSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftUserJourneyStepSizeLimitSetting INSTANCE = new LiveGiftUserJourneyStepSizeLimitSetting();

    public static final int sizeLimit() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_user_journey_step_size_limit", DEFAULT);
    }
}
