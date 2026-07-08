package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_room_back_live_card_opt")
public final class LiveRoomBackLiveCardOpt {
    public static final boolean DEFAULT = false;
    public static final LiveRoomBackLiveCardOpt INSTANCE = new LiveRoomBackLiveCardOpt();
    public static final boolean V2 = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_room_back_live_card_opt", DEFAULT);
    }
}
