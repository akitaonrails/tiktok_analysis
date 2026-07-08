package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_encourage_viewpager_bugfix")
public final class AnchorFinishEncourageBugFixABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorFinishEncourageBugFixABSetting INSTANCE = new AnchorFinishEncourageBugFixABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_encourage_viewpager_bugfix", DEFAULT) != 0;
    }
}
