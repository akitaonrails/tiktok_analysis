package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_karaoke_phase_two_switcher")
public final class MultiGuestKaraokePhaseTwoSwitcherSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestKaraokePhaseTwoSwitcherSetting INSTANCE = new MultiGuestKaraokePhaseTwoSwitcherSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_karaoke_phase_two_switcher", DEFAULT);
    }
}
