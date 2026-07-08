package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_guide_fans_club_avoid_strategy")
public final class GiftGuideFansClubFallbackStrategy {
    public static final int DEFAULT = 0;
    public static final GiftGuideFansClubFallbackStrategy INSTANCE = new GiftGuideFansClubFallbackStrategy();

    public final int strategyGroup() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_guide_fans_club_avoid_strategy", DEFAULT);
    }
}
