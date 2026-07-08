package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_voice_mode_only_ability_reserve")
public final class MultiGuestVoiceModeOnlyAbilityReserveSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestVoiceModeOnlyAbilityReserveSetting INSTANCE = new MultiGuestVoiceModeOnlyAbilityReserveSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_voice_mode_only_ability_reserve", DEFAULT);
    }
}
