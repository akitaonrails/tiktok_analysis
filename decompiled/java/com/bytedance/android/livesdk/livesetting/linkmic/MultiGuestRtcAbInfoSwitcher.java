package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_guest_rtc_ab_info_switcher")
public final class MultiGuestRtcAbInfoSwitcher {
    public static final boolean DEFAULT = true;
    public static final MultiGuestRtcAbInfoSwitcher INSTANCE = new MultiGuestRtcAbInfoSwitcher();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_rtc_ab_info_switcher", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
