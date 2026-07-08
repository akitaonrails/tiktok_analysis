package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("bug_fix_mg_blank_screen_setting")
public final class BugFixMgBlankScreenSetting {
    public static final int DEFAULT = 1;
    public static final BugFixMgBlankScreenSetting INSTANCE = new BugFixMgBlankScreenSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_mg_blank_screen_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
