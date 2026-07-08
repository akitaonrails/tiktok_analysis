package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("team_entrance_click_to_new_page")
public final class FansClubAnchorEntranceGuidePageSettings {
    public static final String DEFAULT = "aweme://roma_redirect/?roma_group_key=roma_schema_group_fans_level_main&roma_page_key=roma_schema_page_anchor_main";
    public static final FansClubAnchorEntranceGuidePageSettings INSTANCE = new FansClubAnchorEntranceGuidePageSettings();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("team_entrance_click_to_new_page", DEFAULT);
    }
}
