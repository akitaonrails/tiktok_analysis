package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_icon_disappear_fix_switch")
public final class LiveMultiGuestIconDisappearFix {
    public static final boolean DEFAULT = true;
    public static final LiveMultiGuestIconDisappearFix INSTANCE = new LiveMultiGuestIconDisappearFix();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_icon_disappear_fix_switch", DEFAULT);
    }
}
