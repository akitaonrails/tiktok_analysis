package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_power_enter_room_opt")
public final class LiveRoomEnterObservableOpt {
    public static final boolean DEFAULT = false;
    public static final LiveRoomEnterObservableOpt INSTANCE = new LiveRoomEnterObservableOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_power_enter_room_opt", DEFAULT);
    }
}
