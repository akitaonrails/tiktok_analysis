package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_rank_top_customer_effect_anchor_time")
public final class LiveTopBuyerEntranceGuideAnimationAnchorTimeSetting {
    public static final LiveTopBuyerEntranceGuideAnimationAnchorTimeSetting INSTANCE = new LiveTopBuyerEntranceGuideAnimationAnchorTimeSetting();
    public static final int DEFAULT = 1200000;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_audience_rank_top_customer_effect_anchor_time", DEFAULT);
    }
}
