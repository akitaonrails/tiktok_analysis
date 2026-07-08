package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_guide_fans_club_fallback")
public final class GiftGuideFansClubFallback {
    public static final GiftGuideFansClubFallback INSTANCE = new GiftGuideFansClubFallback();
    public static final GiftGuideFansClubFallbackParams DEFAULT = new GiftGuideFansClubFallbackParams("gift_guide_popup", 5655);

    public final GiftGuideFansClubFallbackParams getSettingsValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftGuideFansClubFallbackParams giftGuideFansClubFallbackParams = DEFAULT;
        GiftGuideFansClubFallbackParams giftGuideFansClubFallbackParams2 = (GiftGuideFansClubFallbackParams) settingsManager.getValueSafely("gift_guide_fans_club_fallback", giftGuideFansClubFallbackParams);
        return giftGuideFansClubFallbackParams2 != null ? giftGuideFansClubFallbackParams2 : giftGuideFansClubFallbackParams;
    }
}
