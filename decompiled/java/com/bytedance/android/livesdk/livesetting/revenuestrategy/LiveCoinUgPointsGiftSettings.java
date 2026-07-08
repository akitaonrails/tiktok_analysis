package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_ug_points_gift_settings")
public final class LiveCoinUgPointsGiftSettings {
    public static final LiveCoinUgPointsGiftSettings INSTANCE = new LiveCoinUgPointsGiftSettings();
    public static final UgPointsGiftParams DEFAULT = new UgPointsGiftParams(5, "aweme://roma_redirect/?roma_group_key=roma_schema_group_incentive_tasks&roma_page_key=roma_schema_page_points_gift_faq");

    public final int getDelayTimeSeconds() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        UgPointsGiftParams ugPointsGiftParams = DEFAULT;
        UgPointsGiftParams ugPointsGiftParams2 = (UgPointsGiftParams) settingsManager.getValueSafely("live_gift_ug_points_gift_settings", ugPointsGiftParams);
        return ugPointsGiftParams2 != null ? ugPointsGiftParams2.delay : ugPointsGiftParams.delay;
    }

    public final String getSchema() {
        String str;
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        UgPointsGiftParams ugPointsGiftParams = DEFAULT;
        UgPointsGiftParams ugPointsGiftParams2 = (UgPointsGiftParams) settingsManager.getValueSafely("live_gift_ug_points_gift_settings", ugPointsGiftParams);
        return (ugPointsGiftParams2 == null || (str = ugPointsGiftParams2.schema) == null) ? ugPointsGiftParams.schema : str;
    }

    public final UgPointsGiftParams getDEFAULT() {
        return DEFAULT;
    }
}
