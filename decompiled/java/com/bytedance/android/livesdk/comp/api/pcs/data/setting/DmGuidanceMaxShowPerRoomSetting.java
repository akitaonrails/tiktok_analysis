package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "dm_guidance_max_show_per_room")
public final class DmGuidanceMaxShowPerRoomSetting {
    public static final int DEFAULT = 2;
    public static final DmGuidanceMaxShowPerRoomSetting INSTANCE = new DmGuidanceMaxShowPerRoomSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("dm_guidance_max_show_per_room", DEFAULT);
    }
}
