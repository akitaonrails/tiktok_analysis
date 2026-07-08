package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_sharebg_flick_opt")
public final class MultiGuestSharebgFlickOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestSharebgFlickOptSetting INSTANCE = new MultiGuestSharebgFlickOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_sharebg_flick_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() != 0;
    }
}
