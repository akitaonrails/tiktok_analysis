package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_count_down_animation_enable")
public final class LiveBroadcastCountDownAnimationSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastCountDownAnimationSetting INSTANCE = new LiveBroadcastCountDownAnimationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_count_down_animation_enable", DEFAULT);
    }
}
