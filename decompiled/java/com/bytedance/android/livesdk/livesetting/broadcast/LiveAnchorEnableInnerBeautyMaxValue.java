package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_inner_beauty_smooth_max_value")
public final class LiveAnchorEnableInnerBeautyMaxValue {
    public static final int DEFAULT = 85;
    public static final LiveAnchorEnableInnerBeautyMaxValue INSTANCE = new LiveAnchorEnableInnerBeautyMaxValue();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_inner_beauty_smooth_max_value", DEFAULT);
    }
}
