package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_api_merge_report")
public final class LiveShortTouchApiMergeReportSetting {
    public static final LiveShortTouchApiMergeReportSetting INSTANCE = new LiveShortTouchApiMergeReportSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_short_touch_api_merge_report", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
