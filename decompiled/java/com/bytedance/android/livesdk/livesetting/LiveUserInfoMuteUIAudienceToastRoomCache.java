package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_audience_mute_alert_show_toast_room_cache")
public final class LiveUserInfoMuteUIAudienceToastRoomCache {
    public static final LiveUserInfoMuteUIAudienceToastRoomCache INSTANCE = new LiveUserInfoMuteUIAudienceToastRoomCache();
    public static final int DEFAULT = 20;

    public static final int cacheSize() {
        return SettingsManager.INSTANCE.getIntValue("live_audience_mute_alert_show_toast_room_cache", DEFAULT);
    }
}
