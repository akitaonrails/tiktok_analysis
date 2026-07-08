package com.bytedance.android.livesdk.livesetting.grouplive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_viewer_picks_faq_page")
public final class LiveViewerPicksFAQPageSetting {
    public static final LiveViewerPicksFAQPageSetting INSTANCE = new LiveViewerPicksFAQPageSetting();
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=viewer_picks_faq_url";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_viewer_picks_faq_page", DEFAULT);
    }
}
