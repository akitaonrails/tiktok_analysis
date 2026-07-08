package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_lauch_task_enable")
public final class MultiGuestLauchTaskEnableSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestLauchTaskEnableSetting INSTANCE = new MultiGuestLauchTaskEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_lauch_task_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() != 0;
    }
}
