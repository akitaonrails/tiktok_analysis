package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_event_sticker_request_max_delay_time")
public final class LiveEventStickerRequestMaxDelayTimeSetting {
    public static final long DEFAULT = 3000;
    public static final LiveEventStickerRequestMaxDelayTimeSetting INSTANCE = new LiveEventStickerRequestMaxDelayTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_event_sticker_request_max_delay_time", DEFAULT);
    }
}
