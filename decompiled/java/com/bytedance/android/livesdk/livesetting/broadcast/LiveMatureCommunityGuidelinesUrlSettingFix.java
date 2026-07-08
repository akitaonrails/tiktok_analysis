package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_community_guidelines_url_fix")
public final class LiveMatureCommunityGuidelinesUrlSettingFix {
    public static final boolean DEFAULT = true;
    public static final LiveMatureCommunityGuidelinesUrlSettingFix INSTANCE = new LiveMatureCommunityGuidelinesUrlSettingFix();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_community_guidelines_url_fix", DEFAULT);
    }
}
