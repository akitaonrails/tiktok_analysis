package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_fast_scroll_release_type")
public final class LivePublicScreenFastScrollReleaseTypeSetting {
    public static final LivePublicScreenFastScrollReleaseTypeSetting INSTANCE = new LivePublicScreenFastScrollReleaseTypeSetting();
    public static final String[] DEFAULT = {"SystemMessage"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_public_screen_fast_scroll_release_type", DEFAULT);
    }
}
