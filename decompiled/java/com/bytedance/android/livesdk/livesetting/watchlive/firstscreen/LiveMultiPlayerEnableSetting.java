package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_multi_player_enable")
public final class LiveMultiPlayerEnableSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveMultiPlayerEnableSetting INSTANCE = new LiveMultiPlayerEnableSetting();

    private final boolean isEnableInner() {
        if (C486960J7u.LIZ()) {
            return true;
        }
        return SettingsManager.INSTANCE.getBooleanValue("live_multi_player_enable", DEFAULT);
    }

    public final boolean getValue() {
        return isEnableInner() && LiveMultiPlayerDeviceScore.INSTANCE.isEnable();
    }
}
