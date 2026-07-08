package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("gift_gifter_protection_schema")
public final class LiveGiftGifterProtectionSchemaSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=gift_addiction_reminder&roma_group_key=spark_page_gift_addiction_reminder&roma_page_key=p";
    public static final LiveGiftGifterProtectionSchemaSetting INSTANCE = new LiveGiftGifterProtectionSchemaSetting();

    public static final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("gift_gifter_protection_schema", DEFAULT);
    }
}
