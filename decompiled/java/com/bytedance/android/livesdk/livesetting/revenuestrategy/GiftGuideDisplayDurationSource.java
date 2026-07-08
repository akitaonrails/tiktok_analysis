package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_guide_display_duration_source")
public final class GiftGuideDisplayDurationSource {
    public static final int DEFAULT = 0;
    public static final GiftGuideDisplayDurationSource INSTANCE = new GiftGuideDisplayDurationSource();
    public static final int SOURCE_SERVER = 1;

    public final boolean isClientSource() {
        return SettingsManager.INSTANCE.getIntValue("gift_guide_display_duration_source", DEFAULT) == 0;
    }
}
