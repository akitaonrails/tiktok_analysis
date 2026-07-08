package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_first_recharge_exchange_retention_popup")
public final class LiveFirstRechargeExchangeRetentionPopupSchema {
    public static final LiveFirstRechargeExchangeRetentionPopupSchema INSTANCE = new LiveFirstRechargeExchangeRetentionPopupSchema();
    public static final String DEFAULT = "sslocal://lynxview_popup?container_bg_color=00000000&disable_outside_click_close=1&gravity=center&height=700rpx&hide_nav_bar=1&hide_status_bar=0&mask_bg_color=000000b3&show_mask=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_treasure_box%2Fpages%2Fcharge%2Fretention_modal%2Ftemplate.js&use_present=1&use_spark=1";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_first_recharge_exchange_retention_popup", DEFAULT);
    }
}
