package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_notify_ch_end_opt")
public final class CohostWithGuestPhase2NotifyCohostEndOpt {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestPhase2NotifyCohostEndOpt INSTANCE = new CohostWithGuestPhase2NotifyCohostEndOpt();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_notify_ch_end_opt", DEFAULT);
    }
}
