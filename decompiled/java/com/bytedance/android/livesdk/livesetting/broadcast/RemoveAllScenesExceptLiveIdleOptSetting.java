package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "remove_all_scenes_except_live_idle_opt")
public final class RemoveAllScenesExceptLiveIdleOptSetting {
    public static final boolean DEFAULT = false;
    public static final RemoveAllScenesExceptLiveIdleOptSetting INSTANCE = new RemoveAllScenesExceptLiveIdleOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("remove_all_scenes_except_live_idle_opt", DEFAULT);
    }
}
