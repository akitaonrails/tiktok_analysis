package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_audience_check_userlist_enable")
public final class LiveMatchAudienceCheckListSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchAudienceCheckListSetting INSTANCE = new LiveMatchAudienceCheckListSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_audience_check_userlist_enable", DEFAULT);
    }
}
