package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_community_guidelines_url")
public final class LiveMatureCommunityGuidelinesUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveMatureCommunityGuidelinesUrlSetting INSTANCE = new LiveMatureCommunityGuidelinesUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_community_guidelines_url", DEFAULT);
    }
}
