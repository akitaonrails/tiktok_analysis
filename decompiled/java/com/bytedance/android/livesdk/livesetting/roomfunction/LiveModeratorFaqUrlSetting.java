package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_moderator_faq_url")
public final class LiveModeratorFaqUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveModeratorFaqUrlSetting INSTANCE = new LiveModeratorFaqUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_moderator_faq_url", DEFAULT);
    }
}
