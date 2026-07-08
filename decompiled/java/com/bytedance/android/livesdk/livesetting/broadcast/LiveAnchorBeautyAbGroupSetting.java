package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_beauty_ab_group")
public final class LiveAnchorBeautyAbGroupSetting {
    public static final int DEFAULT = 0;
    public static final LiveAnchorBeautyAbGroupSetting INSTANCE = new LiveAnchorBeautyAbGroupSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_beauty_ab_group", DEFAULT);
    }
}
