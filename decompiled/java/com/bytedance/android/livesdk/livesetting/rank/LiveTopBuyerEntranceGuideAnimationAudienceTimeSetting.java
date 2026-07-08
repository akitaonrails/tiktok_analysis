package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_rank_top_customer_effect_audience_time")
public final class LiveTopBuyerEntranceGuideAnimationAudienceTimeSetting {
    public static final LiveTopBuyerEntranceGuideAnimationAudienceTimeSetting INSTANCE = new LiveTopBuyerEntranceGuideAnimationAudienceTimeSetting();
    public static final int DEFAULT = 30000;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_audience_rank_top_customer_effect_audience_time", DEFAULT);
    }
}
