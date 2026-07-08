package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_bug_fix_setting")
public final class LiveToolbarBugfixSetting {
    public static final LiveToolbarBugfixSetting INSTANCE = new LiveToolbarBugfixSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_toolbar_bug_fix_setting", true);

    public final boolean enable() {
        return value;
    }
}
