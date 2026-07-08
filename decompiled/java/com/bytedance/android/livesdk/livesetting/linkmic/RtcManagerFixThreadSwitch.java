package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("rtc_manager_fix_thread_switch")
public final class RtcManagerFixThreadSwitch {
    public static final boolean DEFAULT = false;
    public static final RtcManagerFixThreadSwitch INSTANCE = new RtcManagerFixThreadSwitch();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("rtc_manager_fix_thread_switch", DEFAULT);
    }
}
