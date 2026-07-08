package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_commercial_content_toggle_faq")
public final class LiveCommercialContentToggleFaqUrl {
    public static final LiveCommercialContentToggleFaqUrl INSTANCE = new LiveCommercialContentToggleFaqUrl();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_commercial_content_toggle_faq", DEFAULT);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
