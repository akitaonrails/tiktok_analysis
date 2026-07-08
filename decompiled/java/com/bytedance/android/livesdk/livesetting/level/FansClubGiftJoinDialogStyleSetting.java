package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_gift_join_dialog_style_setting")
public final class FansClubGiftJoinDialogStyleSetting {
    public static final int DEFAULT = 0;
    public static final FansClubGiftJoinDialogStyleSetting INSTANCE = new FansClubGiftJoinDialogStyleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("fans_club_gift_join_dialog_style_setting", DEFAULT);
    }
}
