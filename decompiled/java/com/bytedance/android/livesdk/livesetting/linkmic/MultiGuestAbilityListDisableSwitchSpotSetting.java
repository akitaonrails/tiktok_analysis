package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_switch_spot_disable_play_mode")
public final class MultiGuestAbilityListDisableSwitchSpotSetting {
    public static final MultiGuestAbilityListDisableSwitchSpotSetting INSTANCE = new MultiGuestAbilityListDisableSwitchSpotSetting();
    public static final List<String> DEFAULT = C1697810uHb.LJIIJJI("draw_guess", "live_show", "guest_showdown", "lets_dance");

    public final List<String> getAbilityList() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("linkmic_switch_spot_disable_play_mode", list);
        return list2 != null ? list2 : list;
    }
}
