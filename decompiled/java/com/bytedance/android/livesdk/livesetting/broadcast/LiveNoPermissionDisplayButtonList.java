package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_no_permission_user_button_display_list")
public final class LiveNoPermissionDisplayButtonList {
    public static final LiveNoPermissionDisplayButtonList INSTANCE = new LiveNoPermissionDisplayButtonList();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_no_permission_user_button_display_list", DEFAULT);
    }
}
