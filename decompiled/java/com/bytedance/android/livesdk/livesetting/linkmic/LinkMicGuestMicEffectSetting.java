package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_guest_mic_effect")
public final class LinkMicGuestMicEffectSetting {
    public static final int DEFAULT = 100;
    public static final LinkMicGuestMicEffectSetting INSTANCE = new LinkMicGuestMicEffectSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_guest_mic_effect", DEFAULT);
    }
}
