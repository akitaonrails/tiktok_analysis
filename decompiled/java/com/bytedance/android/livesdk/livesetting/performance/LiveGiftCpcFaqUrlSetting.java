package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_cpc_faq_url")
public final class LiveGiftCpcFaqUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveGiftCpcFaqUrlSetting INSTANCE = new LiveGiftCpcFaqUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_gift_cpc_faq_url", DEFAULT);
    }
}
