package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_guide_url_merge_room_event")
public final class LiveEventStickerApiOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveEventStickerApiOptSetting INSTANCE = new LiveEventStickerApiOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_guide_url_merge_room_event", DEFAULT) == 1;
    }
}
