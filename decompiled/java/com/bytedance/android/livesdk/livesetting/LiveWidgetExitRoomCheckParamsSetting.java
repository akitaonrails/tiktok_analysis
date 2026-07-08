package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_widget_exit_room_check_params")
public final class LiveWidgetExitRoomCheckParamsSetting {
    public static final LiveWidgetExitRoomCheckParamsSetting INSTANCE = new LiveWidgetExitRoomCheckParamsSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_widget_exit_room_check_params", true);

    public final boolean enable() {
        return value;
    }
}
