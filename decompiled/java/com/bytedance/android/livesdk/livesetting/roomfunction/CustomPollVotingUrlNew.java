package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_custom_poll_voting_url")
public final class CustomPollVotingUrlNew {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fvoting%2Ftemplate.js&hide_loading=1&radius=8&use_spark=1&hide_nav_bar=1&silent_load_type=2&gravity=bottom&transition_animation=bottom&self_adaptive_height=1";
    public static final CustomPollVotingUrlNew INSTANCE = new CustomPollVotingUrlNew();

    public final String getUrl() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_custom_poll_voting_url", DEFAULT);
        return stringValue.length() == 0 ? "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fvoting%2Ftemplate.js&hide_loading=1&radius=8&use_spark=1&hide_nav_bar=1&silent_load_type=2&gravity=bottom&transition_animation=bottom&self_adaptive_height=1" : stringValue;
    }
}
