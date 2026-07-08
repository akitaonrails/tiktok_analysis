package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_faq_url")
public final class LiveCohostFaqUrlConfigs {
    public static final LiveCohostFaqUrlConfigs INSTANCE = new LiveCohostFaqUrlConfigs();
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=revenue_cohost_faq";

    public static final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("live_cohost_faq_url", str);
        return stringValue != null ? stringValue : str;
    }
}
