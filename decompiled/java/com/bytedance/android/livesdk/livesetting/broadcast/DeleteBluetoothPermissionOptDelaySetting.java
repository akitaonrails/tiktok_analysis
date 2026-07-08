package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "delete_bluetooth_permission_opt_delay")
public final class DeleteBluetoothPermissionOptDelaySetting {
    public static final long DEFAULT = 0;
    public static final DeleteBluetoothPermissionOptDelaySetting INSTANCE = new DeleteBluetoothPermissionOptDelaySetting();

    public final long delayDuration() {
        return SettingsManager.INSTANCE.getLongValue("delete_bluetooth_permission_opt_delay", DEFAULT);
    }
}
