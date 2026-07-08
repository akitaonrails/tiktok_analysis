package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_play_tool_list_order")
public final class MultiGuestPlayToolListOrderConfig {
    public static final MultiGuestPlayToolListOrderConfig INSTANCE = new MultiGuestPlayToolListOrderConfig();
    public static final String[] DEFAULT = new String[0];

    public final String[] getPlayToolList() {
        return SettingsManager.INSTANCE.getStringArrayValue("multi_guest_play_tool_list_order", DEFAULT);
    }
}
