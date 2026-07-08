package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_public_screen_check_directionality_count")
public final class LivePublicScreenCheckDirectionalityCountSetting {
    public static final int DEFAULT = 20;
    public static final LivePublicScreenCheckDirectionalityCountSetting INSTANCE = new LivePublicScreenCheckDirectionalityCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_check_directionality_count", DEFAULT);
    }
}
