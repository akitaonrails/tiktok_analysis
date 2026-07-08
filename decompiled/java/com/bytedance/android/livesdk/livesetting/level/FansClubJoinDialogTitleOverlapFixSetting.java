package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fans_club_join_dialog_title_overlap_fix")
public final class FansClubJoinDialogTitleOverlapFixSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubJoinDialogTitleOverlapFixSetting INSTANCE = new FansClubJoinDialogTitleOverlapFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_join_dialog_title_overlap_fix", DEFAULT);
    }
}
