package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("hangout_skylight_show_invite_room")
public final class HangoutSkylightShowInviteRoomSetting {
    public static final boolean DEFAULT = false;
    public static final HangoutSkylightShowInviteRoomSetting INSTANCE = new HangoutSkylightShowInviteRoomSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("hangout_skylight_show_invite_room", DEFAULT);
    }
}
