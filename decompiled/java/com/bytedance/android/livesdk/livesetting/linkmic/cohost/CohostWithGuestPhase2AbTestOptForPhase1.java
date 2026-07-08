package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_ab_test_opt_for_phase1")
public final class CohostWithGuestPhase2AbTestOptForPhase1 {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestPhase2AbTestOptForPhase1 INSTANCE = new CohostWithGuestPhase2AbTestOptForPhase1();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_ab_test_opt_for_phase1", DEFAULT);
    }
}
