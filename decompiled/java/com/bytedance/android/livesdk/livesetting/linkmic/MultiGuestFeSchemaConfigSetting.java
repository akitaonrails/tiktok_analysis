package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey("multi_guest_fe_schema")
public final class MultiGuestFeSchemaConfigSetting {
    public static final MultiGuestFeSchemaConfigSetting INSTANCE = new MultiGuestFeSchemaConfigSetting();
    public static final MultiGuestFeSchemaConfig DEFAULT = new MultiGuestFeSchemaConfig("", "", "", "aweme://roma_redirect/?spark_page=guest_point_panel", "", "", "aweme://roma_redirect/?spark_page=top_guest_ranking_list", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ftext-header-faq%2Ftemplate.js&use_spark=1&bdhm_bid=tiktok_live_mg_guest_text_header_faq&height=70%25&gravity=bottom&radius=12&height_mode=fixed_7&use_live_sheet=1 ", "aweme://roma_redirect/?spark_page=guest_showdown_ranking", "aweme://roma_redirect/?spark_page=guest_showdown_settings", "aweme://roma_redirect/?spark_page=guest_showdown_faq");

    public final MultiGuestFeSchemaConfig getValue() {
        MultiGuestFeSchemaConfig multiGuestFeSchemaConfig = (MultiGuestFeSchemaConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestFeSchemaConfigSetting.class);
        return multiGuestFeSchemaConfig == null ? DEFAULT : multiGuestFeSchemaConfig;
    }
}
