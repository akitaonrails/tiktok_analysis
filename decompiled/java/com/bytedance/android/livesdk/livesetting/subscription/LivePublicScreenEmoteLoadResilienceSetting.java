package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_public_screen_emote_load_resilience")
public final class LivePublicScreenEmoteLoadResilienceSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenEmoteLoadResilienceSetting INSTANCE = new LivePublicScreenEmoteLoadResilienceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_emote_load_resilience", DEFAULT);
    }
}
