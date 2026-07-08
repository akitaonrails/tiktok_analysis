package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_camera_log_upload_config")
public final class TTLHCameraLogUploadConfigSettings {
    public static final int DEFAULT = 0;
    public static final TTLHCameraLogUploadConfigSettings INSTANCE = new TTLHCameraLogUploadConfigSettings();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_camera_log_upload_config", DEFAULT);
    }
}
