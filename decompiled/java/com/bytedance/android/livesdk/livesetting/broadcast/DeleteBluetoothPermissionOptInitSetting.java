package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "delete_bluetooth_permission_opt_init")
public final class DeleteBluetoothPermissionOptInitSetting {
    public static final boolean DEFAULT = false;
    public static final DeleteBluetoothPermissionOptInitSetting INSTANCE = new DeleteBluetoothPermissionOptInitSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("delete_bluetooth_permission_opt_init", DEFAULT);
    }

    public final boolean disable() {
        return !enable();
    }
}
