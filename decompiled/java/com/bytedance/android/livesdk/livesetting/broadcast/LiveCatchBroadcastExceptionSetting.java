package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_catch_broadcast_exception_setting")
public final class LiveCatchBroadcastExceptionSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCatchBroadcastExceptionSetting INSTANCE = new LiveCatchBroadcastExceptionSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_catch_broadcast_exception_setting", DEFAULT);
    }
}
