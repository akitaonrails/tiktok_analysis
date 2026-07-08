package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_info_audience_schema")
public final class LiveInfoDetailPageLynxUrl {
    public static final LiveInfoDetailPageLynxUrl INSTANCE = new LiveInfoDetailPageLynxUrl();
    public static final String DEFAULT = "";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("live_info_audience_schema", str);
        return stringValue != null ? stringValue : str;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
