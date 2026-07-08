package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_tt_education_schema")
public final class LiveSafetyEducationSchema {
    public static final String DEFAULT = "sslocal://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Ftiktok_livesafety%2Fpages%2Fcpp_live_edu_v2%2Findex.html&hide_nav_bar=1&show_loading=1";
    public static final LiveSafetyEducationSchema INSTANCE = new LiveSafetyEducationSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_tt_education_schema", DEFAULT);
    }
}
