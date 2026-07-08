package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_avatar_fix_capture")
public final class MultiGuestAvatarFixCaptureSetting {
    public static final MultiGuestAvatarFixCaptureSetting INSTANCE = new MultiGuestAvatarFixCaptureSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_avatar_fix_capture", DEFAULT);
    }
}
