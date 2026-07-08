package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2live_skip_effect_in_radio_mode")
public final class M2LiveSkipEffectInRadioMode {
    public static final boolean DEFAULT = false;
    public static final M2LiveSkipEffectInRadioMode INSTANCE = new M2LiveSkipEffectInRadioMode();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("m2live_skip_effect_in_radio_mode", DEFAULT);
    }
}
