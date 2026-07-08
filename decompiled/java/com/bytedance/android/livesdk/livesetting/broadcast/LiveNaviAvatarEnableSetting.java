package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_navi_avatar_enable")
public final class LiveNaviAvatarEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveNaviAvatarEnableSetting INSTANCE = new LiveNaviAvatarEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_navi_avatar_enable", DEFAULT);
    }
}
