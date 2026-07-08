package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_super_fan_join_page_style")
public final class FansClubJoinDialogSetting {
    public static final int DEFAULT = 0;
    public static final FansClubJoinDialogSetting INSTANCE = new FansClubJoinDialogSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_super_fan_join_page_style", DEFAULT);
    }
}
