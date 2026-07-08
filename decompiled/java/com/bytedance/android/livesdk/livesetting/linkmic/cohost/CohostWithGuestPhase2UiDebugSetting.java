package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_ui_debug_setting")
public final class CohostWithGuestPhase2UiDebugSetting {
    public static final boolean DEFAULT = false;
    public static final CohostWithGuestPhase2UiDebugSetting INSTANCE = new CohostWithGuestPhase2UiDebugSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_ui_debug_setting", DEFAULT);
    }
}
