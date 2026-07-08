package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_smooth_room_create_opt")
public final class AnchorSmoothRoomCreateOptABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorSmoothRoomCreateOptABSetting INSTANCE = new AnchorSmoothRoomCreateOptABSetting();

    public final boolean enable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        return settingsManager.getIntValue("anchor_smooth_room_create_opt", DEFAULT) == 1 || settingsManager.getIntValue(AnchorSmoothRoomCreateOptABSetting.class) == 2;
    }

    public final boolean isV2() {
        return SettingsManager.INSTANCE.getIntValue("anchor_smooth_room_create_opt", DEFAULT) == 2;
    }
}
