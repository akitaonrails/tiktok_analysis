package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_gauss_blur_size")
public final class MultiGuestGaussSizeSetting {
    public static final MultiGuestGaussSizeSetting INSTANCE = new MultiGuestGaussSizeSetting();
    public static final int DEFAULT = 100;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_gauss_blur_size", DEFAULT);
    }
}
