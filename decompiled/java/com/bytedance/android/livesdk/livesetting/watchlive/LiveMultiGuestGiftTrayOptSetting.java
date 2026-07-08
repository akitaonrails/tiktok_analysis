package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_gift_tray_multi_guest_opt_type")
public final class LiveMultiGuestGiftTrayOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveMultiGuestGiftTrayOptSetting INSTANCE = new LiveMultiGuestGiftTrayOptSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_tray_multi_guest_opt_type", DEFAULT);
    }

    public static final boolean isSmallTrayOnWindow() {
        return INSTANCE.getValue() == 1;
    }

    public final boolean isOptimizeMultiGuest() {
        return getValue() != 0;
    }

    public final boolean isSmallTrayOnPublicScreen() {
        return getValue() == 2;
    }
}
