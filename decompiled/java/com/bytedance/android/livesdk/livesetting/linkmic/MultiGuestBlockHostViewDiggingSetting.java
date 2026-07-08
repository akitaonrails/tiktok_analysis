package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_block_hostview_digging")
public final class MultiGuestBlockHostViewDiggingSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestBlockHostViewDiggingSetting INSTANCE = new MultiGuestBlockHostViewDiggingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_block_hostview_digging", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
