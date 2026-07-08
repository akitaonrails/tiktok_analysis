package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_advanced_message_universe_purple_background_url")
public final class LiveAdvanceMessageBackgroundUrlConfig {
    public static final LiveAdvanceMessageBackgroundUrlConfig INSTANCE = new LiveAdvanceMessageBackgroundUrlConfig();
    public static final String DEFAULT = "https://p19-webcast.tiktokcdn.com/webcast-va/live_announcement_bg_lv2@3x.png-1759219763583~tplv-obj.image";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_advanced_message_universe_purple_background_url", DEFAULT);
    }
}
