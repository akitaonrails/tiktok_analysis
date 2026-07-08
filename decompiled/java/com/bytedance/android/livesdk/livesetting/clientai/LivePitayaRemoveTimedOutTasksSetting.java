package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pitaya_remove_timed_out_tasks")
public final class LivePitayaRemoveTimedOutTasksSetting {
    public static final boolean DEFAULT = false;
    public static final LivePitayaRemoveTimedOutTasksSetting INSTANCE = new LivePitayaRemoveTimedOutTasksSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pitaya_remove_timed_out_tasks", DEFAULT);
    }
}
