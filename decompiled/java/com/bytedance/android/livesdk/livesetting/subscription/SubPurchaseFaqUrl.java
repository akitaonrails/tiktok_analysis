package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("subscription_purchase_faq_url")
public final class SubPurchaseFaqUrl {
    public static final String DEFAULT = "";
    public static final SubPurchaseFaqUrl INSTANCE = new SubPurchaseFaqUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscription_purchase_faq_url", DEFAULT);
    }
}
