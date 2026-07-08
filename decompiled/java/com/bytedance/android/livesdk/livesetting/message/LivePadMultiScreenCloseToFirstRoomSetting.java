package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pad_multi_screen_close_to_first_room")
public final class LivePadMultiScreenCloseToFirstRoomSetting {
    public static final boolean DEFAULT = false;
    public static final LivePadMultiScreenCloseToFirstRoomSetting INSTANCE = new LivePadMultiScreenCloseToFirstRoomSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pad_multi_screen_close_to_first_room", DEFAULT);
    }
}
