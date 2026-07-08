package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_enter_exit_room_sei_switch")
public final class LivesdkEnterExitRoomSeiSwitchSetting {
    public static final boolean DEFAULT = true;
    public static final LivesdkEnterExitRoomSeiSwitchSetting INSTANCE = new LivesdkEnterExitRoomSeiSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_enter_exit_room_sei_switch", DEFAULT);
    }
}
