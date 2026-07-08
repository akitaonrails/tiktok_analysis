package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_face_detect_step")
public final class TTLHEnableFaceDetectStepOptSettings {
    public static final int DEFAULT = 0;
    public static final TTLHEnableFaceDetectStepOptSettings INSTANCE = new TTLHEnableFaceDetectStepOptSettings();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_face_detect_step", DEFAULT);
    }
}
