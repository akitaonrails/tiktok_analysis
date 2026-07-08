package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_leaf_fix_enabled")
public final class LiveTakeTheStageLeafFixSetting {
    public static final boolean DEFAULT = false;
    public static final LiveTakeTheStageLeafFixSetting INSTANCE = new LiveTakeTheStageLeafFixSetting();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_the_stage_leaf_fix_enabled", DEFAULT);
    }
}
