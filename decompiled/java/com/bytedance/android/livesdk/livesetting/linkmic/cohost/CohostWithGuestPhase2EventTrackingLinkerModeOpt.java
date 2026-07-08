package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_event_tracking_linker_mode_opt")
public final class CohostWithGuestPhase2EventTrackingLinkerModeOpt {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestPhase2EventTrackingLinkerModeOpt INSTANCE = new CohostWithGuestPhase2EventTrackingLinkerModeOpt();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_event_tracking_linker_mode_opt", DEFAULT);
    }
}
