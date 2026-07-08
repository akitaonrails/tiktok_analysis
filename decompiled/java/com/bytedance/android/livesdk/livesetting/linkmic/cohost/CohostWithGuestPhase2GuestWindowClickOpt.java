package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_guest_window_click_opt")
public final class CohostWithGuestPhase2GuestWindowClickOpt {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestPhase2GuestWindowClickOpt INSTANCE = new CohostWithGuestPhase2GuestWindowClickOpt();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_guest_window_click_opt", DEFAULT);
    }
}
