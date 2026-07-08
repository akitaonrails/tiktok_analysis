package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_cover_camera_bugfix")
public final class AnchorCoverCameraBugFixABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorCoverCameraBugFixABSetting INSTANCE = new AnchorCoverCameraBugFixABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_cover_camera_bugfix", DEFAULT) == 1;
    }
}
