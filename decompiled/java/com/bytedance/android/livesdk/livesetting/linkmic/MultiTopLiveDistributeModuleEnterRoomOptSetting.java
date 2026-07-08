package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_distribute_module_enter_room_opt")
public final class MultiTopLiveDistributeModuleEnterRoomOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveDistributeModuleEnterRoomOptSetting INSTANCE = new MultiTopLiveDistributeModuleEnterRoomOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_distribute_module_enter_room_opt", DEFAULT);
    }
}
