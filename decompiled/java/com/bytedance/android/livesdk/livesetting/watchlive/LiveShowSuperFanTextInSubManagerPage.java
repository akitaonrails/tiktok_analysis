package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_show_super_fan_text_in_sub_manager_page")
public final class LiveShowSuperFanTextInSubManagerPage {
    public static final boolean DEFAULT = false;
    public static final LiveShowSuperFanTextInSubManagerPage INSTANCE = new LiveShowSuperFanTextInSubManagerPage();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_show_super_fan_text_in_sub_manager_page", DEFAULT);
    }
}
