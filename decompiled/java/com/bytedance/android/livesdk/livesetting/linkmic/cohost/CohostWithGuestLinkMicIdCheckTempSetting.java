package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("cohost_with_guest_linkmicid_check_temp")
public final class CohostWithGuestLinkMicIdCheckTempSetting {
    public static final boolean DEFAULT = false;
    public static final CohostWithGuestLinkMicIdCheckTempSetting INSTANCE = new CohostWithGuestLinkMicIdCheckTempSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_linkmicid_check_temp", DEFAULT);
    }
}
