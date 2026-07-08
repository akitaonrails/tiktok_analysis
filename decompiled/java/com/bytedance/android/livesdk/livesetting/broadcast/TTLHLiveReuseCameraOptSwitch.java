package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_live_reuse_camera_opt")
public final class TTLHLiveReuseCameraOptSwitch {
    public static final int DEFAULT = 0;
    public static final TTLHLiveReuseCameraOptSwitch INSTANCE = new TTLHLiveReuseCameraOptSwitch();

    public final int enableTTLHLiveReuseCameraOpt() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_live_reuse_camera_opt", DEFAULT);
    }
}
