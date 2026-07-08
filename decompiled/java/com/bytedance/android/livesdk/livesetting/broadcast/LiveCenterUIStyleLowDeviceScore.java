package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_center_prompt_card_low_device_score")
public final class LiveCenterUIStyleLowDeviceScore {
    public static final LiveCenterUIStyleLowDeviceScore INSTANCE = new LiveCenterUIStyleLowDeviceScore();
    public static final float DEFAULT = 6.9f;
    public static final float value = SettingsManager.INSTANCE.getFloatValue("live_anchor_center_prompt_card_low_device_score", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final float getValue() {
        return value;
    }
}
