package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("hangout_toplive_new_user_guide_enable")
public final class HangoutTopliveNewUserGuideEnableSetting {
    public static final int CMP = 2;
    public static final int DEFAULT = 0;
    public static final HangoutTopliveNewUserGuideEnableSetting INSTANCE = new HangoutTopliveNewUserGuideEnableSetting();
    public static final int NATIVE = 1;

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("hangout_toplive_new_user_guide_enable", DEFAULT);
    }

    public final boolean enable() {
        return value() == 1 || value() == 2;
    }
}
