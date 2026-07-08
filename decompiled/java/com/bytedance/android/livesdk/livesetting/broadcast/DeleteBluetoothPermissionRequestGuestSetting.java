package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "delete_bluetooth_permission_request_guest")
public final class DeleteBluetoothPermissionRequestGuestSetting {
    public static final boolean DEFAULT = false;
    public static final DeleteBluetoothPermissionRequestGuestSetting INSTANCE = new DeleteBluetoothPermissionRequestGuestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("delete_bluetooth_permission_request_guest", DEFAULT);
    }
}
