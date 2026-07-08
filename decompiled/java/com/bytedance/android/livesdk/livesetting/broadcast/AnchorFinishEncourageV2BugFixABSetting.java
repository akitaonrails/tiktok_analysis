package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_encourage_viewpager_v2_bugfix")
public final class AnchorFinishEncourageV2BugFixABSetting {
    public static final boolean DEFAULT = false;
    public static final AnchorFinishEncourageV2BugFixABSetting INSTANCE = new AnchorFinishEncourageV2BugFixABSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("anchor_encourage_viewpager_v2_bugfix", DEFAULT);
    }
}
