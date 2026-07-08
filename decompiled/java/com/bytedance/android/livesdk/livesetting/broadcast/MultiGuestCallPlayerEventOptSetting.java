package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multiguest_call_player_event_opt_setting")
public final class MultiGuestCallPlayerEventOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestCallPlayerEventOptSetting INSTANCE = new MultiGuestCallPlayerEventOptSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_call_player_event_opt_setting", DEFAULT);
    }
}
