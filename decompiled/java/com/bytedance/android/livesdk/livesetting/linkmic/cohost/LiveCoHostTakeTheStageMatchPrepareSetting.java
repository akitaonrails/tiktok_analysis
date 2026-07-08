package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_take_the_stage_match_prepare_enable")
public final class LiveCoHostTakeTheStageMatchPrepareSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostTakeTheStageMatchPrepareSetting INSTANCE = new LiveCoHostTakeTheStageMatchPrepareSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_take_the_stage_match_prepare_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
