package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveIgnoreMessageCheckForBytestSetting;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_mt_ignore_room_check")
public final class LiveMtIgnoreRoomCheckSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMtIgnoreRoomCheckSetting INSTANCE = new LiveMtIgnoreRoomCheckSetting();
    public static boolean ignoreRoomCheck;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_mt_ignore_room_check", DEFAULT) || ignoreRoomCheck || LiveIgnoreMessageCheckForBytestSetting.INSTANCE.getValue();
    }

    public final void setIgnoreRoomCheck(boolean z) {
        ignoreRoomCheck = z;
    }
}
