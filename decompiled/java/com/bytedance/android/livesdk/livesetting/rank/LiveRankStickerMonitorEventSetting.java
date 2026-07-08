package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_rank_sticker_monitor_event_enable")
public final class LiveRankStickerMonitorEventSetting {
    public static final LiveRankStickerMonitorEventSetting INSTANCE = new LiveRankStickerMonitorEventSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_sticker_monitor_event_enable", DEFAULT);
    }
}
