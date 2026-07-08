package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = true, value = "camera_notification_bubble_status")
public final class BroadcastLiveLopBubbleSetting {
    public static final int DEFAULT = 0;
    public static final BroadcastLiveLopBubbleSetting INSTANCE = new BroadcastLiveLopBubbleSetting();

    public final boolean isLibFour() {
        return SettingsManager.INSTANCE.getIntValue("camera_notification_bubble_status", DEFAULT) == 4;
    }

    public final boolean isLibOne() {
        return SettingsManager.INSTANCE.getIntValue("camera_notification_bubble_status", DEFAULT) == 1;
    }

    public final boolean isLibThree() {
        return SettingsManager.INSTANCE.getIntValue("camera_notification_bubble_status", DEFAULT) == 3;
    }

    public final boolean isLibTwo() {
        return SettingsManager.INSTANCE.getIntValue("camera_notification_bubble_status", DEFAULT) == 2;
    }

    public final boolean isMatch() {
        return isLibOne() || isLibTwo() || isLibThree() || isLibFour();
    }
}
