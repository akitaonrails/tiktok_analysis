package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_short_touch_all_in_one_report")
public final class LiveShortTouchAllInOneReportSetting {
    public static final LiveShortTouchAllInOneReportSetting INSTANCE = new LiveShortTouchAllInOneReportSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_short_touch_all_in_one_report", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
