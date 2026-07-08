package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("cohost_with_guest_wp_fix_enable_setting")
public final class CohostWithGuestWPFixSetting {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestWPFixSetting INSTANCE = new CohostWithGuestWPFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_wp_fix_enable_setting", DEFAULT);
    }
}
