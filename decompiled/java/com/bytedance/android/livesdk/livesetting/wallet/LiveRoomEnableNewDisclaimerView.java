package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_room_enable_new_disclaimer")
public final class LiveRoomEnableNewDisclaimerView {
    public static final LiveRoomEnableNewDisclaimerView INSTANCE = new LiveRoomEnableNewDisclaimerView();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_room_enable_new_disclaimer", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
