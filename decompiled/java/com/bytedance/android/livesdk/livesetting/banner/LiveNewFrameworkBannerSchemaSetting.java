package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("tiktok_live_banner_new_scheme")
public final class LiveNewFrameworkBannerSchemaSetting {
    public static final String DEFAULT = "sslocal://lynxview?disable_bounces=1&use_forest=1&action_type=draw&bdhm_bid=tiktok_live_fundamental_banner_container&bdhm_pid=banner_container_v2&__live_platform__=webcast&gecko_url_redirection=1&url=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_fundamental_banner_container/pages/container-v2/template.js";
    public static final LiveNewFrameworkBannerSchemaSetting INSTANCE = new LiveNewFrameworkBannerSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("tiktok_live_banner_new_scheme", DEFAULT);
    }
}
