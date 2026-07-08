package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_game_short_touch_alpha_enable")
public final class LiveGameShortTouchAlphaEnableSetting {
    public static final LiveGameShortTouchAlphaEnableSetting INSTANCE = new LiveGameShortTouchAlphaEnableSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_game_short_touch_alpha_enable", true);

    public final boolean enable() {
        return value;
    }
}
