package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_bottom_sheet_behavior_scroll_fix")
public final class LiveBottomSheetBehaviorScrollFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBottomSheetBehaviorScrollFixSetting INSTANCE = new LiveBottomSheetBehaviorScrollFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_bottom_sheet_behavior_scroll_fix", DEFAULT);
    }
}
