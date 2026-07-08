package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_guest_adapt_avatar_effect")
public final class MultiGuestNaviAvatarSwitcherSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestNaviAvatarSwitcherSetting INSTANCE = new MultiGuestNaviAvatarSwitcherSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_adapt_avatar_effect", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
