package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_take_the_stage_color_list")
public final class LiveTakeTheStageColorListConfigSetting {
    public static final LiveTakeTheStageColorListConfigSetting INSTANCE = new LiveTakeTheStageColorListConfigSetting();
    public static final LiveTakeTheStageColorItemList DEFAULT = new LiveTakeTheStageColorItemList();

    public final LiveTakeTheStageColorItemList getValue() {
        LiveTakeTheStageColorItemList liveTakeTheStageColorItemList = (LiveTakeTheStageColorItemList) SettingsManager.INSTANCE.getValueSafely(LiveTakeTheStageColorListConfigSetting.class);
        return liveTakeTheStageColorItemList == null ? DEFAULT : liveTakeTheStageColorItemList;
    }
}
