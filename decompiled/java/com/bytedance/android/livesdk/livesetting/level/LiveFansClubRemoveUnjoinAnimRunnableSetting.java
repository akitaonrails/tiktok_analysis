package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_remove_unjoin_anim_runnable")
public final class LiveFansClubRemoveUnjoinAnimRunnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubRemoveUnjoinAnimRunnableSetting INSTANCE = new LiveFansClubRemoveUnjoinAnimRunnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_remove_unjoin_anim_runnable", DEFAULT);
    }
}
