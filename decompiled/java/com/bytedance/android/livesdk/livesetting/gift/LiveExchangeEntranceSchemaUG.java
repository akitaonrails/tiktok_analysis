package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_exchange_entrance_schema_ug")
public final class LiveExchangeEntranceSchemaUG {
    public static final String DEFAULT = "aweme://roma_redirect?roma_group_key=roma_schema_group_one_wallet&roma_page_key=roma_schema_page_exchange_panel&height=1050rpx&radius=8&gravity=bottom&transition_animation=right";
    public static final LiveExchangeEntranceSchemaUG INSTANCE = new LiveExchangeEntranceSchemaUG();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_exchange_entrance_schema_ug", DEFAULT);
    }
}
