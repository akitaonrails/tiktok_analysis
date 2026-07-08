package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_window_memory_fix_setting")
public final class CohostWithGuestWindowRetainMemoryFixSetting {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestWindowRetainMemoryFixSetting INSTANCE = new CohostWithGuestWindowRetainMemoryFixSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_window_memory_fix_setting", DEFAULT);
    }
}
