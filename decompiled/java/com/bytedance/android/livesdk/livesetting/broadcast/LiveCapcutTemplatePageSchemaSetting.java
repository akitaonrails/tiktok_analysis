package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("capcut_template_list_page_schema")
public final class LiveCapcutTemplatePageSchemaSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview?status_bar_bg_color=121212&status_font_mode=light&hide_nav_bar=1&hide_status_bar=0&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_replay%2Fpages%2Fcapcut-template-list%2Ftemplate.js&should_full_screen=1&bdhm_bid=tiktok_live_fundamental_replay&bdhm_pid=capcut-template-list";
    public static final LiveCapcutTemplatePageSchemaSetting INSTANCE = new LiveCapcutTemplatePageSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("capcut_template_list_page_schema", DEFAULT);
    }
}
