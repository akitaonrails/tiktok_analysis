package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_enter_room_state_fix_enable")
public final class LiveCohostEnterRoomStateFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostEnterRoomStateFixSetting INSTANCE = new LiveCohostEnterRoomStateFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_enter_room_state_fix_enable", DEFAULT);
    }
}
