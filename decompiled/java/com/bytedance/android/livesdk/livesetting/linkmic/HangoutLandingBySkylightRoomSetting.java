package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("hangout_landing_by_skylight_room")
public final class HangoutLandingBySkylightRoomSetting {
    public static final boolean DEFAULT = false;
    public static final HangoutLandingBySkylightRoomSetting INSTANCE = new HangoutLandingBySkylightRoomSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("hangout_landing_by_skylight_room", DEFAULT);
    }
}
