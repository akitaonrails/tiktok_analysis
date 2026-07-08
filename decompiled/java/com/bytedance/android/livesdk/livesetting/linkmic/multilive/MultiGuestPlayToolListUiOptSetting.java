package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_guest_play_tool_list_opt")
public final class MultiGuestPlayToolListUiOptSetting {
    public static final int DEFAULT = 1;
    public static final MultiGuestPlayToolListUiOptSetting INSTANCE = new MultiGuestPlayToolListUiOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_play_tool_list_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
