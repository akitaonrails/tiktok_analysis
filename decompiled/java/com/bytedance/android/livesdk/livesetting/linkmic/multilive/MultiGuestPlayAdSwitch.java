package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_play_ad_switch")
public final class MultiGuestPlayAdSwitch {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlayAdSwitch INSTANCE = new MultiGuestPlayAdSwitch();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_play_ad_switch", DEFAULT);
    }
}
