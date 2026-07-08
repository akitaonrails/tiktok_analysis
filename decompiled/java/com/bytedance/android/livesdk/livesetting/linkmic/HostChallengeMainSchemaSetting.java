package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "host_challenge_main_schema")
public final class HostChallengeMainSchemaSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Fhost-challenge%2Fmain%2Ftemplate.js&use_spark=1&gecko_url_redirection=1&bdhm_bid=tiktok_live_interaction_multi_guest&trans_status_bar=1&use_forest=1&target_handler=webcast&use_present=1&gravity=bottom&radius=12&height=70%25&enter_from=connection_panel";
    public static final HostChallengeMainSchemaSetting INSTANCE = new HostChallengeMainSchemaSetting();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue("host_challenge_main_schema", DEFAULT);
    }
}
