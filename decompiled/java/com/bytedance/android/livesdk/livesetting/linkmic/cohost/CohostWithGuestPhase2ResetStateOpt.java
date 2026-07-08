package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_reset_state_opt")
public final class CohostWithGuestPhase2ResetStateOpt {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestPhase2ResetStateOpt INSTANCE = new CohostWithGuestPhase2ResetStateOpt();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_reset_state_opt", DEFAULT);
    }
}
