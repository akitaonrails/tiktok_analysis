package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_clear_screen_follow_shrink_end_opt")
public final class LiveClearScreenFollowShrinkEndOptSetting {
    public static final LiveClearScreenFollowShrinkEndOptSetting INSTANCE = new LiveClearScreenFollowShrinkEndOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_clear_screen_follow_shrink_end_opt", true);

    public final boolean enable() {
        return value;
    }
}
