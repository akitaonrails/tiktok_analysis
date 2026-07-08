package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_superfan_hide_more_btn")
public final class LiveFansClubSuperFanHideMoreBtnSettings {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubSuperFanHideMoreBtnSettings INSTANCE = new LiveFansClubSuperFanHideMoreBtnSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_superfan_hide_more_btn", DEFAULT);
    }
}
