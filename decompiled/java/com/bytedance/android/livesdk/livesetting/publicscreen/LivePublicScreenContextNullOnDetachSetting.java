package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_publicscreen_context_null_on_detach")
public final class LivePublicScreenContextNullOnDetachSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenContextNullOnDetachSetting INSTANCE = new LivePublicScreenContextNullOnDetachSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_publicscreen_context_null_on_detach", DEFAULT);
    }
}
