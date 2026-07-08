package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_auto_translate_default_state")
public final class LiveAutoTranslateStateSetting {
    public static final LiveAutoTranslateStateSetting INSTANCE = new LiveAutoTranslateStateSetting();
    public static final boolean DEFAULT = true;

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_auto_translate_default_state", DEFAULT);
    }
}
