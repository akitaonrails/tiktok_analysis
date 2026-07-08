package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_community_guideline")
public final class LiveCommunityGuidelineSetting {
    public static final String DEFAULT = "";
    public static final LiveCommunityGuidelineSetting INSTANCE = new LiveCommunityGuidelineSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_community_guideline", DEFAULT);
    }
}
