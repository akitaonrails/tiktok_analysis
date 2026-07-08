package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("gamelive_dual_device_qrcode_schema")
public final class GameDualDeviceSchema {
    public static final String DEFAULT = "";
    public static final GameDualDeviceSchema INSTANCE = new GameDualDeviceSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("gamelive_dual_device_qrcode_schema", DEFAULT);
    }
}
