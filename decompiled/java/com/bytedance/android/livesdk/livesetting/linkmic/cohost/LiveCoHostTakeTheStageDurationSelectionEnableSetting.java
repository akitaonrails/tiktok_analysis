package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_duration_selection_enable")
public final class LiveCoHostTakeTheStageDurationSelectionEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostTakeTheStageDurationSelectionEnableSetting INSTANCE = new LiveCoHostTakeTheStageDurationSelectionEnableSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_the_stage_duration_selection_enable", DEFAULT);
    }
}
