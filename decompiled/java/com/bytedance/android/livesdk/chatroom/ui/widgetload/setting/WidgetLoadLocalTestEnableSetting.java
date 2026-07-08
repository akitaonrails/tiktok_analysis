package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("widget_load_local_test_enable")
public final class WidgetLoadLocalTestEnableSetting {
    public static final WidgetLoadLocalTestEnableSetting INSTANCE = new WidgetLoadLocalTestEnableSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("widget_load_local_test_enable", true);

    public final boolean enable() {
        return value;
    }
}
