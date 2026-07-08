package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_unpolished_tip_face_threshold")
public final class MultiCoHostUnpolishedTipFaceThresholdSetting {
    public static final MultiCoHostUnpolishedTipFaceThresholdSetting INSTANCE = new MultiCoHostUnpolishedTipFaceThresholdSetting();
    public static final double DEFAULT = 0.3d;

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_cohost_unpolished_tip_face_threshold", DEFAULT);
    }
}
