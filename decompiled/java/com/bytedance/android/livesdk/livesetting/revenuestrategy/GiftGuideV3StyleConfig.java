package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_guide_v3_style")
public final class GiftGuideV3StyleConfig {
    public static final int DEFAULT = 0;
    public static final GiftGuideV3StyleConfig INSTANCE = new GiftGuideV3StyleConfig();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_guide_v3_style", DEFAULT);
    }
}
