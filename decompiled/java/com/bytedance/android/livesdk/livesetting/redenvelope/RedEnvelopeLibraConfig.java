package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_envelope")
public final class RedEnvelopeLibraConfig {
    public static final boolean DEFAULT = true;
    public static final RedEnvelopeLibraConfig INSTANCE = new RedEnvelopeLibraConfig();

    public final boolean enableEnvelopeFunc() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_envelope", DEFAULT);
    }
}
