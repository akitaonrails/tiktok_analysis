package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_avatar_feature")
public final class MultiGuestAvatarFeatureSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestAvatarFeatureSetting INSTANCE = new MultiGuestAvatarFeatureSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_avatar_feature", DEFAULT);
    }

    public final boolean hasSeeAbility() {
        return getValue() >= 1;
    }

    public final boolean hasUseAbility() {
        return getValue() >= 2;
    }
}
