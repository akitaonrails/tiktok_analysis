package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_ab_empty_setting")
public final class CohostWithGuestABEmptySettings {
    public static final int DEFAULT = 1;
    public static final CohostWithGuestABEmptySettings INSTANCE = new CohostWithGuestABEmptySettings();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("cohost_with_guest_ab_empty_setting", DEFAULT);
    }

    private final boolean isEnabledForAll() {
        return getValue() == 1;
    }

    public final boolean isDisabled() {
        return getValue() == 0;
    }

    public final boolean isEnabledForAnchor() {
        return isEnabledForAll() || getValue() == 2;
    }

    public final boolean isEnabledForAudience() {
        return isEnabledForAll() || getValue() == 3;
    }
}
