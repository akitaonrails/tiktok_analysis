package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cohost_fps_anchor")
public final class CoHostAnchorPFSSetting {
    public static final CoHostAnchorPFSSetting INSTANCE = new CoHostAnchorPFSSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_fps_anchor", DEFAULT);
    }
}
