package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_sub_widget_scatter_enable")
public final class LiveSubWidgetScatterEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSubWidgetScatterEnableSetting INSTANCE = new LiveSubWidgetScatterEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_widget_scatter_enable", DEFAULT);
    }
}
