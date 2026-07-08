package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_android_background_opt")
public final class MultiGuestAndroidBackgroundOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestAndroidBackgroundOptSetting INSTANCE = new MultiGuestAndroidBackgroundOptSetting();
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_android_background_opt", DEFAULT);
    }

    public final boolean isOptSetBg() {
        return getValue() == 1;
    }
}
