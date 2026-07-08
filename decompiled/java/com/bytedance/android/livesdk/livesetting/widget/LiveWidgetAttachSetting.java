package com.bytedance.android.livesdk.livesetting.widget;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_attach_opt_list")
public final class LiveWidgetAttachSetting {
    public static final String[] DEFAULT;
    public static final LiveWidgetAttachSetting INSTANCE = new LiveWidgetAttachSetting();
    public static final String[] value;

    static {
        String[] strArr = {""};
        DEFAULT = strArr;
        value = SettingsManager.INSTANCE.getStringArrayValue("live_widget_attach_opt_list", strArr);
    }

    public final String[] enable() {
        return value;
    }
}
