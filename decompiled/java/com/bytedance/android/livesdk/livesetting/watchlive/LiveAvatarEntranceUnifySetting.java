package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_avatar_entrance_unify")
public final class LiveAvatarEntranceUnifySetting {
    public static final boolean DEFAULT = false;
    public static final LiveAvatarEntranceUnifySetting INSTANCE = new LiveAvatarEntranceUnifySetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_avatar_entrance_unify", DEFAULT);
    }
}
