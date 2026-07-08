package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_union_session_timer_setting")
public final class CohostUnionSessionTimerSetting {
    public static final boolean DEFAULT = true;
    public static final CohostUnionSessionTimerSetting INSTANCE = new CohostUnionSessionTimerSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_union_session_timer_setting", DEFAULT);
    }
}
