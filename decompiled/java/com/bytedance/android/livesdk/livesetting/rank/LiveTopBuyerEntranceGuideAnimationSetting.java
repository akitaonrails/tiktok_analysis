package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_rank_top_customer_effect")
public final class LiveTopBuyerEntranceGuideAnimationSetting {
    public static final boolean DEFAULT = false;
    public static final LiveTopBuyerEntranceGuideAnimationSetting INSTANCE = new LiveTopBuyerEntranceGuideAnimationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_audience_rank_top_customer_effect", DEFAULT);
    }
}
