package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "creator_growth_main_popup_schema")
public final class CreatorGrowthMainSchemaSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?hide_nav_bar=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_creator_growth%2Fpages%2Fmain%2Ftemplate.js&hide_loading=1&radius=12&use_live_sheet=1&launch_mode=navigate&self_adaptive_height=1&gravity=bottom&bdhm_bid=tiktok_live_fundamental_creator_growth&bdhm_pid=main-popup";
    public static final CreatorGrowthMainSchemaSetting INSTANCE = new CreatorGrowthMainSchemaSetting();

    public final String getSchema() {
        return SettingsManager.INSTANCE.getStringValue("creator_growth_main_popup_schema", DEFAULT);
    }
}
