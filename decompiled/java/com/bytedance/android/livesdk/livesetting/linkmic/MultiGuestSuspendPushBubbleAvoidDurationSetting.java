package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_suspend_push_bubble_avoid_duration")
public final class MultiGuestSuspendPushBubbleAvoidDurationSetting {
    public static final long DEFAULT = 5;
    public static final MultiGuestSuspendPushBubbleAvoidDurationSetting INSTANCE = new MultiGuestSuspendPushBubbleAvoidDurationSetting();

    public final long durationInSecond() {
        return SettingsManager.INSTANCE.getLongValue("multi_guest_suspend_push_bubble_avoid_duration", DEFAULT);
    }
}
