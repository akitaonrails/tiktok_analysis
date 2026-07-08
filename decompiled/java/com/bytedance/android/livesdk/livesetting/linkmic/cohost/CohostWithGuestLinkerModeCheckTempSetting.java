package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_linkermode_check_temp")
public final class CohostWithGuestLinkerModeCheckTempSetting {
    public static final boolean DEFAULT = false;
    public static final CohostWithGuestLinkerModeCheckTempSetting INSTANCE = new CohostWithGuestLinkerModeCheckTempSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_linkermode_check_temp", DEFAULT);
    }
}
