package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_paid_event_switch")
public final class LivePaidEventSwitchSetting {
    public static final boolean DEFAULT = true;
    public static final LivePaidEventSwitchSetting INSTANCE = new LivePaidEventSwitchSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_paid_event_switch", DEFAULT);
    }
}
