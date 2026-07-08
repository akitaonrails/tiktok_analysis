package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_capture_resolution_align_push")
public final class TTLHCaptureAlignPushSwitch {
    public static final int DEFAULT = 0;
    public static final TTLHCaptureAlignPushSwitch INSTANCE = new TTLHCaptureAlignPushSwitch();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_capture_resolution_align_push", DEFAULT) == 1;
    }
}
