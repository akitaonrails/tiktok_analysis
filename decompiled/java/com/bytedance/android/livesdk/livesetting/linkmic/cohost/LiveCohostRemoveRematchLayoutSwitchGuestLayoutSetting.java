package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_remove_rematch_layout_switch_guest_layout")
public final class LiveCohostRemoveRematchLayoutSwitchGuestLayoutSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostRemoveRematchLayoutSwitchGuestLayoutSetting INSTANCE = new LiveCohostRemoveRematchLayoutSwitchGuestLayoutSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_remove_rematch_layout_switch_guest_layout", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
