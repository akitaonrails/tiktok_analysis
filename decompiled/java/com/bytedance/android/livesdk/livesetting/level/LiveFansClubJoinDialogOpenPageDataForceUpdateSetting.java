package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fans_club_join_dialog_open_page_data_force_update")
public final class LiveFansClubJoinDialogOpenPageDataForceUpdateSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubJoinDialogOpenPageDataForceUpdateSetting INSTANCE = new LiveFansClubJoinDialogOpenPageDataForceUpdateSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_join_dialog_open_page_data_force_update", DEFAULT);
    }
}
