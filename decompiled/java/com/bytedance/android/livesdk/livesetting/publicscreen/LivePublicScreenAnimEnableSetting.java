package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ps_animation_able")
public final class LivePublicScreenAnimEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LivePublicScreenAnimEnableSetting INSTANCE = new LivePublicScreenAnimEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ps_animation_able", DEFAULT);
    }
}
