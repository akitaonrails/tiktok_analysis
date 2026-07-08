package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("cohost_with_guest_phase2_force_enable_debug_setting")
public final class CohostWithGuestPhase2ForceEnableDebugSetting {
    public static final boolean DEFAULT = false;
    public static final CohostWithGuestPhase2ForceEnableDebugSetting INSTANCE = new CohostWithGuestPhase2ForceEnableDebugSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_force_enable_debug_setting", DEFAULT);
    }
}
