package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_public_screen_effective_duration")
public final class LivePublicScreenEffectiveDurationSetting {
    public static final long DEFAULT = 724;
    public static final LivePublicScreenEffectiveDurationSetting INSTANCE = new LivePublicScreenEffectiveDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_public_screen_effective_duration", DEFAULT);
    }
}
