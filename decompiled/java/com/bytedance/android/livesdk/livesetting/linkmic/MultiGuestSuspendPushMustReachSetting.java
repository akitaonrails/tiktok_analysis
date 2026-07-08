package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_suspend_push_must_reach")
public final class MultiGuestSuspendPushMustReachSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestSuspendPushMustReachSetting INSTANCE = new MultiGuestSuspendPushMustReachSetting();

    public final boolean allSceneMustPush() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_suspend_push_must_reach", DEFAULT) == 2;
    }
}
