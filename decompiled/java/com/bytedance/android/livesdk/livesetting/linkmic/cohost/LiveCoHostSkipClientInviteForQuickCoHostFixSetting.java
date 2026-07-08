package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_co_host_skip_client_invite_for_quick_co_host_fix")
public final class LiveCoHostSkipClientInviteForQuickCoHostFixSetting {
    public static final int DEFAULT = 1;
    public static final LiveCoHostSkipClientInviteForQuickCoHostFixSetting INSTANCE = new LiveCoHostSkipClientInviteForQuickCoHostFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_co_host_skip_client_invite_for_quick_co_host_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
