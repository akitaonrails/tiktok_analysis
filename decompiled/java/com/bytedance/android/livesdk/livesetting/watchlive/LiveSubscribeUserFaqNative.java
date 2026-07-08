package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscription_new_user_faq_url_native")
public final class LiveSubscribeUserFaqNative {
    public static final LiveSubscribeUserFaqNative INSTANCE = new LiveSubscribeUserFaqNative();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscription_new_user_faq_url_native", DEFAULT);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
