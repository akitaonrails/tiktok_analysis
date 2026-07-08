package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_level_expand_rect_fix")
public final class FansClubExpandRectFixSetting {
    public static final int DEFAULT = 1;
    public static final FansClubExpandRectFixSetting INSTANCE = new FansClubExpandRectFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_level_expand_rect_fix", DEFAULT);
    }

    public final boolean checkTouchDelegateData() {
        return getValue() == 2;
    }

    public final boolean resetTouchDelegate() {
        return getValue() == 1;
    }
}
