package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("enable_multi_guest_room_share_panel_filter")
public final class MultiGuestEnableRoomSharePanelFilterSetting {
    public static final MultiGuestEnableRoomSharePanelFilterSetting INSTANCE = new MultiGuestEnableRoomSharePanelFilterSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("enable_multi_guest_room_share_panel_filter", DEFAULT);

    public static final boolean enable() {
        return value;
    }
}
