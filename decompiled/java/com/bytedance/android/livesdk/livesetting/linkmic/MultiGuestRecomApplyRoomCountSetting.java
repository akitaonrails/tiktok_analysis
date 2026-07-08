package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_recom_apply_room_count")
public final class MultiGuestRecomApplyRoomCountSetting {
    public static final int DEFAULT = 1;
    public static final MultiGuestRecomApplyRoomCountSetting INSTANCE = new MultiGuestRecomApplyRoomCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_recom_apply_room_count", DEFAULT);
    }
}
