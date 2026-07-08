package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_rtc_ab_switcher")
public final class MultiGuestRtcAbSwitcherSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestRtcAbSwitcherSetting INSTANCE = new MultiGuestRtcAbSwitcherSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_rtc_ab_switcher", DEFAULT);
    }
}
