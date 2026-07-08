package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_fans_hide_back_to_space_container")
public final class LiveFansClubHideBackContainerSettings {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubHideBackContainerSettings INSTANCE = new LiveFansClubHideBackContainerSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_hide_back_to_space_container", DEFAULT);
    }
}
