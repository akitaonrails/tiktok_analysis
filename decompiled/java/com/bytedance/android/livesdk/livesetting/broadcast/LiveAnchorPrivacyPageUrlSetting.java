package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_anchor_privacy_page_url")
public final class LiveAnchorPrivacyPageUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveAnchorPrivacyPageUrlSetting INSTANCE = new LiveAnchorPrivacyPageUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_anchor_privacy_page_url", DEFAULT);
    }
}
