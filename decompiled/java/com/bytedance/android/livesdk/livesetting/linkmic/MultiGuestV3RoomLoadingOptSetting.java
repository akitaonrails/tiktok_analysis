package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sdk_multiguest_opt_room_loading")
public final class MultiGuestV3RoomLoadingOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3RoomLoadingOptSetting INSTANCE = new MultiGuestV3RoomLoadingOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multiguest_opt_room_loading", DEFAULT);
    }
}
