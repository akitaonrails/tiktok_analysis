package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "optimize_enter_room_pipeline")
public final class OptimizeEnterRoomPipelineSetting {
    public static final boolean DEFAULT = false;
    public static final OptimizeEnterRoomPipelineSetting INSTANCE = new OptimizeEnterRoomPipelineSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("optimize_enter_room_pipeline", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
