package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_avatar_config")
public final class MultiGuestAvatarConfigSetting {
    public static final MultiGuestAvatarConfigSetting INSTANCE = new MultiGuestAvatarConfigSetting();
    public static final MultiGuestAvatarConfig DEFAULT = new MultiGuestAvatarConfig(true, true, 180, 30, 5, 20, 60, 180, 0, 0, 0, true, 540);

    public final MultiGuestAvatarConfig getValue() {
        MultiGuestAvatarConfig multiGuestAvatarConfig = (MultiGuestAvatarConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestAvatarConfigSetting.class);
        return multiGuestAvatarConfig == null ? DEFAULT : multiGuestAvatarConfig;
    }
}
