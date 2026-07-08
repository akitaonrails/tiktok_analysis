package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_onboarding_program_panel_schema")
public final class LiveOnboardingProgramPanelSchema {
    public static final LiveOnboardingProgramPanelSchema INSTANCE = new LiveOnboardingProgramPanelSchema();
    public static final LiveLOPSchemaData DEFAULT = new LiveLOPSchemaData("sslocal://webcast_lynxview?hide_nav_bar=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_tools%2Fpages%2Flop-pannel%2Ftemplate.js%3Fhide_loading%3D1&should_full_screen=1&hide_status_bar=0&bdhm_bid=tiktok_live_fundamental_live_onboard_program&bdhm_pid=lop-pannel", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_tools%2Fpages%2Flop-pannel%2Ftemplate.js&show_loading=1&hide_nav_bar=1&height_mode=max_6&silent_load_type=2&use_live_sheet=1&launch_mode=navigate&enter_from=like_take_page_banner");

    public final String getFullPageSchema() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveLOPSchemaData liveLOPSchemaData = DEFAULT;
        LiveLOPSchemaData liveLOPSchemaData2 = (LiveLOPSchemaData) settingsManager.getValueSafely("live_onboarding_program_panel_schema", liveLOPSchemaData);
        if (liveLOPSchemaData2 != null) {
            liveLOPSchemaData = liveLOPSchemaData2;
        }
        return liveLOPSchemaData.fullSchema;
    }

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveLOPSchemaData liveLOPSchemaData = DEFAULT;
        LiveLOPSchemaData liveLOPSchemaData2 = (LiveLOPSchemaData) settingsManager.getValueSafely("live_onboarding_program_panel_schema", liveLOPSchemaData);
        if (liveLOPSchemaData2 != null) {
            liveLOPSchemaData = liveLOPSchemaData2;
        }
        return liveLOPSchemaData.popupSchema;
    }
}
