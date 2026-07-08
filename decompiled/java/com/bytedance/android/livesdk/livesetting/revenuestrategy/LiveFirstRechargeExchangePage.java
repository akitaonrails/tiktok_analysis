package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_first_recharge_exchange_page")
public final class LiveFirstRechargeExchangePage {
    public static final LiveFirstRechargeExchangePage INSTANCE = new LiveFirstRechargeExchangePage();
    public static final String DEFAULT = "aweme://roma_redirect?roma_group_key=roma_schema_group_one_wallet&roma_page_key=roma_schema_page_exchange_panel";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_first_recharge_exchange_page", DEFAULT);
    }
}
