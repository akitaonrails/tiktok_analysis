package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = true, value = "live_center_entrance_verify")
public final class LiveCenterEntranceVerifySetting {
    public static final long DEFAULT = 2;
    public static final LiveCenterEntranceVerifySetting INSTANCE = new LiveCenterEntranceVerifySetting();

    public final long delayTime() {
        return SettingsManager.INSTANCE.getLongValue("live_center_entrance_verify", DEFAULT);
    }
}
