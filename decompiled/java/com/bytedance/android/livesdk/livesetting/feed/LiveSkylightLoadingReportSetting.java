package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_skylight_loading_report")
public final class LiveSkylightLoadingReportSetting {
    public static final LiveSkylightLoadingReportSetting INSTANCE = new LiveSkylightLoadingReportSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_skylight_loading_report", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
