package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_multi_guest_switch_layout_opt")
public final class LinkMicMultiGuestSwitchLayoutOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestSwitchLayoutOptSetting INSTANCE = new LinkMicMultiGuestSwitchLayoutOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_multi_guest_switch_layout_opt", DEFAULT);
    }
}
