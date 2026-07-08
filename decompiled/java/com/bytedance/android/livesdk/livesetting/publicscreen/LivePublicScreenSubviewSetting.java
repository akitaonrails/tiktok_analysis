package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_management")
public final class LivePublicScreenSubviewSetting {
    public static final int DEFAULT = 0;
    public static final LivePublicScreenSubviewSetting INSTANCE = new LivePublicScreenSubviewSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_management", DEFAULT);
    }

    public final boolean appendTag() {
        return getValue() == 2;
    }

    public final boolean onlyShowTag() {
        return getValue() == 1;
    }

    public final boolean showSubview() {
        return getValue() > 0;
    }
}
