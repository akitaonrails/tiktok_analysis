package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_reuse_skylight_enter_room")
public final class TopliveReuseSkylightDataSetting {
    public static final boolean DEFAULT = false;
    public static final TopliveReuseSkylightDataSetting INSTANCE = new TopliveReuseSkylightDataSetting();

    public final boolean getConfig() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_reuse_skylight_enter_room", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
