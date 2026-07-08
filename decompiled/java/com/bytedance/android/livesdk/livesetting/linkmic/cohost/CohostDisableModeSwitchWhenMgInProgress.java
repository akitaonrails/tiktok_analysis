package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_disable_mode_switch_when_mg_in_progress")
public final class CohostDisableModeSwitchWhenMgInProgress {
    public static final boolean DEFAULT = true;
    public static final CohostDisableModeSwitchWhenMgInProgress INSTANCE = new CohostDisableModeSwitchWhenMgInProgress();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_disable_mode_switch_when_mg_in_progress", DEFAULT);
    }
}
