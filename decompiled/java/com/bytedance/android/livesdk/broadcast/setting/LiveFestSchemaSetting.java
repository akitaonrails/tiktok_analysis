package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_fest_schema")
public final class LiveFestSchemaSetting {
    public static final LiveFestSchemaSetting INSTANCE = new LiveFestSchemaSetting();
    public static final String DEFAULT = "aweme://lynxview?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2F7%2Fgecko%2Fresource%2Ftiktok_live_2024_eoy_warmup_wallet_popup%2Fgecko%2Fpages%2Fhome%2Ftemplate.js%0A&use_spark=1&bdhm_bid=&join_url=sslocal%3A%2F%2Fwebcast_webview%3Furl%3Dhttps%253A%252F%252Fcampaign-va.tiktokv.com%252Ffalcon%252F2024_10_fest_warmup%252Fpages%252Fhome%252Findex.html%253F__live_platform__%253Dwebcast%2526hide_nav_bar%253D1%2526activity_name%253Dt_24_fest_w%2526enable_resource_intercept%253D1%2526target_handler%253Dwebcast%2526_pia_%253D1%2526fe_enter_from%253Dend_page_popup%26__live_platform__%3Dwebcast%26hide_nav_bar%3D1%26fe_enter_from%3Dend_page_popup%26activity_name%3Dt_24_fest_w%26enable_resource_intercept%3D1%26target_handler%3Dwebcast%26_pia_%3D1%26use_forest%3D1";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_fest_schema", DEFAULT);
    }
}
