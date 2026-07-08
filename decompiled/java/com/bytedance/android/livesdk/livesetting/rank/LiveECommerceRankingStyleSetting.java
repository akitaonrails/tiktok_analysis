package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("us_ecommerce_rank_list")
public final class LiveECommerceRankingStyleSetting {
    public static final int DEFAULT = 0;
    public static final LiveECommerceRankingStyleSetting INSTANCE = new LiveECommerceRankingStyleSetting();
    public static boolean isCreator;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("us_ecommerce_rank_list", DEFAULT);
    }

    public final boolean isCreator() {
        return isCreator;
    }

    public final void setCreator(boolean z) {
        isCreator = z;
    }
}
