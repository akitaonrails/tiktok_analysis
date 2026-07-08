package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_batch_send_faq_url")
public final class LiveGiftBatchSendFaq {
    public static final LiveGiftBatchSendFaq INSTANCE = new LiveGiftBatchSendFaq();
    public static final String DEFAULT = "aweme://roma_redirect/?roma_group_key=roma_schema_group_fav_gift_panel&roma_page_key=roma_schema_page_batch_gifting_faq";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_gift_batch_send_faq_url", DEFAULT);
    }
}
