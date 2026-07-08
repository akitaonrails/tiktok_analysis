package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_super_fans_live_only_faq_url")
public final class LiveSuperFanLiveOnlyFaqUrlSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=fan_club_anchor_faq_fullscreen&roma_group_key=spark_page_fan_club_anchor_faq_fullscreen&roma_page_key=p";
    public static final LiveSuperFanLiveOnlyFaqUrlSetting INSTANCE = new LiveSuperFanLiveOnlyFaqUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_super_fans_live_only_faq_url", DEFAULT);
    }
}
