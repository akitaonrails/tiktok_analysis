package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_middle_container_schema")
public final class LiveMiddleTouchContainerSchemaSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_lynx_goal_indicator_container%2Fpages%2Fmiddle-touch-container%2Ftemplate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=1&use_spark=1";
    public static final LiveMiddleTouchContainerSchemaSetting INSTANCE = new LiveMiddleTouchContainerSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_middle_container_schema", DEFAULT);
    }
}
