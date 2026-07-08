package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_fix_first_uid_enter_room")
public final class LiveFixFirstUidEnterRoomSetting {
    public static final LiveFixFirstUidEnterRoomSetting INSTANCE = new LiveFixFirstUidEnterRoomSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fix_first_uid_enter_room", DEFAULT);
    }

    public final boolean enabled() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
