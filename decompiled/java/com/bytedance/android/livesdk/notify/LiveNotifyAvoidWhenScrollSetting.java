package com.bytedance.android.livesdk.notify;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_notify_avoid_when_scroll")
public final class LiveNotifyAvoidWhenScrollSetting {
    public static final int AVOID_WHEN_ACTIVE = 2;
    public static final int AVOID_WHEN_INACTIVE = 1;
    public static final int DEFAULT = 0;
    public static final LiveNotifyAvoidWhenScrollSetting INSTANCE = new LiveNotifyAvoidWhenScrollSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_notify_avoid_when_scroll", DEFAULT);
    }
}
