package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_disable_in_room_signal_exp")
public final class LiveDisableInRoomSignalExp {
    public static final boolean DEFAULT = false;
    public static final LiveDisableInRoomSignalExp INSTANCE = new LiveDisableInRoomSignalExp();

    private final boolean value() {
        return SettingsManager.INSTANCE.getBooleanValue("live_disable_in_room_signal_exp", DEFAULT);
    }

    public final boolean enable() {
        return value();
    }
}
