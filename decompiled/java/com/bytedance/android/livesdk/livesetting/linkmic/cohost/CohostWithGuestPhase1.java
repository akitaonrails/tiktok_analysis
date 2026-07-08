package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_x_multiguest_phase1")
public final class CohostWithGuestPhase1 {
    public static final boolean DEFAULT = false;
    public static final CohostWithGuestPhase1 INSTANCE = new CohostWithGuestPhase1();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_x_multiguest_phase1", DEFAULT);
    }
}
