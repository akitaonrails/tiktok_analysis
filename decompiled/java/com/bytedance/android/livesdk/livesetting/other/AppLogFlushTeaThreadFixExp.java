package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_applog_flush_tea_thread_fix")
public final class AppLogFlushTeaThreadFixExp {
    public static final AppLogFlushTeaThreadFixExp INSTANCE = new AppLogFlushTeaThreadFixExp();
    public static final boolean DEFAULT = false;
    public static final boolean isEnable = SettingsManager.INSTANCE.getBooleanValue("live_applog_flush_tea_thread_fix", DEFAULT);

    public final boolean isEnable() {
        return isEnable;
    }
}
