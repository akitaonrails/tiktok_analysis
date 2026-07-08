package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_remove_live_show_from_live_cell_opt")
public final class LiveSdkRemoveLiveShowFromLiveCellOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkRemoveLiveShowFromLiveCellOptSetting INSTANCE = new LiveSdkRemoveLiveShowFromLiveCellOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_remove_live_show_from_live_cell_opt", DEFAULT);
    }
}
