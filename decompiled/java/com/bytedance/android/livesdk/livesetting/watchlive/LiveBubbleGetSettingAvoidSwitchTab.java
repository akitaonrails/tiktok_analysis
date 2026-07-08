package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_bubble_get_setting_avoid_switch_tab")
public final class LiveBubbleGetSettingAvoidSwitchTab {
    public static final boolean DEFAULT = true;
    public static final LiveBubbleGetSettingAvoidSwitchTab INSTANCE = new LiveBubbleGetSettingAvoidSwitchTab();

    public final boolean disable() {
        return !(C486960J7u.LIZ() ? true : SettingsManager.INSTANCE.getBooleanValue(LiveBubbleGetSettingAvoidSwitchTab.class));
    }
}
