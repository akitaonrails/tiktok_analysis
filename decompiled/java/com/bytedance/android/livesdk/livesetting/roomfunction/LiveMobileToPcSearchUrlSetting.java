package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_mobile_to_pc_search_url")
public final class LiveMobileToPcSearchUrlSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_multi_end%2Fpages%2Flive-relay%2Ftemplate.js&hide_loading=1&&radius=8&transition_animation=bottom&gravity=bottom&bdhm_bid=tiktok_live_fundamental_multi_end&bdhm_pid=live_relay&height=60%25&user_spark=1";
    public static final LiveMobileToPcSearchUrlSetting INSTANCE = new LiveMobileToPcSearchUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_mobile_to_pc_search_url", DEFAULT);
    }
}
