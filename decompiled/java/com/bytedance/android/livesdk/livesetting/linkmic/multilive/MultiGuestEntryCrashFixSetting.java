package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_entry_crash_fix_enable")
public final class MultiGuestEntryCrashFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestEntryCrashFixSetting INSTANCE = new MultiGuestEntryCrashFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_entry_crash_fix_enable", DEFAULT);
    }
}
