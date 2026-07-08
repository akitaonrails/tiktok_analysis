package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("privilege_entrance_schema")
public final class LivePrivilegeCenterSchemaSetting {
    public static final LivePrivilegeCenterSchemaSetting INSTANCE = new LivePrivilegeCenterSchemaSetting();
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?show_mask=0&container_bg_color=0B0B1F&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_privilege%2Fpages%2Fprivilege_list%2Ftemplate.js&gravity=bottom&height=900rpx";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("privilege_entrance_schema", DEFAULT);
    }
}
