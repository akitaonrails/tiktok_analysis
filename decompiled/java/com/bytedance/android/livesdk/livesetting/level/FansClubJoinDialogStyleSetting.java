package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_join_dialog_style_setting")
public final class FansClubJoinDialogStyleSetting {
    public static final int DEFAULT = 0;
    public static final FansClubJoinDialogStyleSetting INSTANCE = new FansClubJoinDialogStyleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("fans_club_join_dialog_style_setting", DEFAULT);
    }

    public final boolean isExperimentalGroup() {
        return getValue() == 1 || getValue() == 2 || getValue() == 3;
    }
}
