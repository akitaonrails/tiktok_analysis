package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_avatar_blur_encode_opt")
public final class MultiGuestAvatarEncodeOptSetting {
    public static final MultiGuestAvatarEncodeOptSetting INSTANCE = new MultiGuestAvatarEncodeOptSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_avatar_blur_encode_opt", DEFAULT);
    }

    public final boolean enable() {
        return getValue() && MultiGuestGaussOptSetting.INSTANCE.enable();
    }
}
