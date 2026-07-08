package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C504210Jpz;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_reuse_camera_capture")
public final class AnchorReuseCameraCaptureABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorReuseCameraCaptureABSetting INSTANCE = new AnchorReuseCameraCaptureABSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_reuse_camera_capture", DEFAULT) == 1 && C504210Jpz.LIZ;
    }
}
