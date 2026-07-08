package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_opt_click_enter_room")
public final class LiveOptClickEnterRoom {
    public static final boolean DEFAULT = false;
    public static final LiveOptClickEnterRoom INSTANCE = new LiveOptClickEnterRoom();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_click_enter_room", DEFAULT);
    }
}
