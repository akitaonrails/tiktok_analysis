package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_room_back_live_card_fix")
public final class LiveRoomBackLiveCardFix {
    public static final boolean DEFAULT = true;
    public static final LiveRoomBackLiveCardFix INSTANCE = new LiveRoomBackLiveCardFix();
    public static final boolean ONLINE_GROUP = false;

    public final boolean fixed() {
        return SettingsManager.INSTANCE.getBooleanValue("live_room_back_live_card_fix", DEFAULT);
    }
}
