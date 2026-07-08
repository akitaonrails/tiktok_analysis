package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_inner_beauty_smooth_default_value")
public final class LiveAnchorEnableInnerBeautyDefaultValue {
    public static final int DEFAULT = 0;
    public static final LiveAnchorEnableInnerBeautyDefaultValue INSTANCE = new LiveAnchorEnableInnerBeautyDefaultValue();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_inner_beauty_smooth_default_value", DEFAULT);
    }
}
