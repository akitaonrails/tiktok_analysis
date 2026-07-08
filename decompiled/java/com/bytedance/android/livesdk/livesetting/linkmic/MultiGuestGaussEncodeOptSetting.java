package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_gauss_blur_encode_opt")
public final class MultiGuestGaussEncodeOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestGaussEncodeOptSetting INSTANCE = new MultiGuestGaussEncodeOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_gauss_blur_encode_opt", DEFAULT);
    }

    public final boolean enable() {
        return getValue() && MultiGuestGaussOptSetting.INSTANCE.enable();
    }
}
