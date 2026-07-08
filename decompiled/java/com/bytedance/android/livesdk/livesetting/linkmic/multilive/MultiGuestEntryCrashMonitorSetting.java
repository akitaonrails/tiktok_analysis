package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_entry_crash_monitor_enable")
public final class MultiGuestEntryCrashMonitorSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestEntryCrashMonitorSetting INSTANCE = new MultiGuestEntryCrashMonitorSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_entry_crash_monitor_enable", DEFAULT);
    }
}
