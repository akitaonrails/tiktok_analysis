package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "opt_go_live_buletooth_permission_request")
public final class OptGoLiveBluetoothPermissionRequestSetting {
    public static final boolean DEFAULT = false;
    public static final OptGoLiveBluetoothPermissionRequestSetting INSTANCE = new OptGoLiveBluetoothPermissionRequestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("opt_go_live_buletooth_permission_request", DEFAULT);
    }
}
