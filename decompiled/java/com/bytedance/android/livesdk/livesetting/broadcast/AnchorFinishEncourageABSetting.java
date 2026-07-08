package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_finish_encourage")
public final class AnchorFinishEncourageABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorFinishEncourageABSetting INSTANCE = new AnchorFinishEncourageABSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("anchor_finish_encourage", DEFAULT) == 1;
    }

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_finish_encourage", DEFAULT) != 0;
    }
}
