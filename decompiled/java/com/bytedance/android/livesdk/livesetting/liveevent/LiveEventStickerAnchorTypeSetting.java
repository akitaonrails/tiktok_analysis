package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_event_sticker_anchor_type")
public final class LiveEventStickerAnchorTypeSetting {
    public static final int DEFAULT = 0;
    public static final LiveEventStickerAnchorTypeSetting INSTANCE = new LiveEventStickerAnchorTypeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_event_sticker_anchor_type", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
