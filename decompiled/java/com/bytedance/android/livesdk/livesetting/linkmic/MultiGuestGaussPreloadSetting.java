package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_gauss_blur_preload")
public final class MultiGuestGaussPreloadSetting {
    public static final MultiGuestGaussPreloadSetting INSTANCE = new MultiGuestGaussPreloadSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_gauss_blur_preload", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
