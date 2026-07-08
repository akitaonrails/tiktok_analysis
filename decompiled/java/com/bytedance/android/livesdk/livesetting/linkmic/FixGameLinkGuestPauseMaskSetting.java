package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "fix_gamelink_guest_pause_mask")
public final class FixGameLinkGuestPauseMaskSetting {
    public static final boolean DEFAULT = true;
    public static final FixGameLinkGuestPauseMaskSetting INSTANCE = new FixGameLinkGuestPauseMaskSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("fix_gamelink_guest_pause_mask", DEFAULT);
    }
}
