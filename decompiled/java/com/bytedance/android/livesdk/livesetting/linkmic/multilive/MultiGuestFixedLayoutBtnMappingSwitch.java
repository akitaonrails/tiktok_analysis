package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fixed_layout_btn_mapping_switch")
public final class MultiGuestFixedLayoutBtnMappingSwitch {
    public static final boolean DEFAULT = false;
    public static final MultiGuestFixedLayoutBtnMappingSwitch INSTANCE = new MultiGuestFixedLayoutBtnMappingSwitch();

    public final boolean isOn() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fixed_layout_btn_mapping_switch", DEFAULT);
    }
}
