package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("first_frame_log_enable_async")
public final class FixReportPrioritySetting {
    public static final boolean DEFAULT = false;
    public static final FixReportPrioritySetting INSTANCE = new FixReportPrioritySetting();
    public static final boolean asyncLog = true;

    public final boolean isAsyncLog() {
        return SettingsManager.INSTANCE.getBooleanValue("first_frame_log_enable_async", DEFAULT);
    }

    public final boolean getAsyncLog() {
        return asyncLog;
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
