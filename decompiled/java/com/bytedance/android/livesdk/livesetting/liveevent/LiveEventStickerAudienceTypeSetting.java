package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_event_sticker_audience_type_v2")
public final class LiveEventStickerAudienceTypeSetting {
    public static final int DEFAULT = 0;
    public static final LiveEventStickerAudienceTypeSetting INSTANCE = new LiveEventStickerAudienceTypeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_event_sticker_audience_type_v2", DEFAULT);
    }

    public final boolean enable() {
        int value = getValue();
        return value == 1 || value == 2;
    }

    public final boolean styleV2() {
        return getValue() == 2;
    }
}
