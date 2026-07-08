package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_revert_follow_button")
public final class MultiGuestRevertFollowButton {
    public static final MultiGuestRevertFollowButton INSTANCE = new MultiGuestRevertFollowButton();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("multi_guest_revert_follow_button", DEFAULT);

    public static final boolean enable() {
        return value;
    }
}
