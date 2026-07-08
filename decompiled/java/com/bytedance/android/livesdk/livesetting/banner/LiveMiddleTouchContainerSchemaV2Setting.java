package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_middle_container_schema_v2")
public final class LiveMiddleTouchContainerSchemaV2Setting {
    public static final String DEFAULT = "sslocal://webcast_lynxview?url=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_lynx_goal_indicator_container/pages/middle-touch-container-v2/template.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=1&use_spark=1&bdhm_bid=tiktok_live_fundamental_middle_touch";
    public static final LiveMiddleTouchContainerSchemaV2Setting INSTANCE = new LiveMiddleTouchContainerSchemaV2Setting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_middle_container_schema_v2", DEFAULT);
    }
}
