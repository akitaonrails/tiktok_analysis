package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_gauss_blur_opt")
public final class MultiGuestGaussOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestGaussOptSetting INSTANCE = new MultiGuestGaussOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_gauss_blur_opt", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
