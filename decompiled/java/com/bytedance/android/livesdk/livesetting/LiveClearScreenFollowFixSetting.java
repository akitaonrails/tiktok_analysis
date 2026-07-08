package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_follow_clear_screen_fix")
public final class LiveClearScreenFollowFixSetting {
    public static final LiveClearScreenFollowFixSetting INSTANCE = new LiveClearScreenFollowFixSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_follow_clear_screen_fix", true);

    public final boolean disable() {
        return !value;
    }
}
