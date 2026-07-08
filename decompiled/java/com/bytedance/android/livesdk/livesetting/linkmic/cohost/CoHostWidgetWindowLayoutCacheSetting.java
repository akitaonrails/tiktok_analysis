package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_widget_window_layout_cache_settings")
public final class CoHostWidgetWindowLayoutCacheSetting {
    public static final int DEFAULT = 0;
    public static final CoHostWidgetWindowLayoutCacheSetting INSTANCE = new CoHostWidgetWindowLayoutCacheSetting();

    private final boolean isTablet() {
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2();
    }

    public final boolean isEnable() {
        return !isTablet() && SettingsManager.INSTANCE.getIntValue("live_cohost_widget_window_layout_cache_settings", DEFAULT) > 0;
    }

    public final boolean isEnableWidgetView() {
        return !isTablet() && (SettingsManager.INSTANCE.getIntValue("live_cohost_widget_window_layout_cache_settings", DEFAULT) & 1) == 1;
    }

    public final boolean isEnableWindowView() {
        return !isTablet() && (SettingsManager.INSTANCE.getIntValue("live_cohost_widget_window_layout_cache_settings", DEFAULT) & 2) == 2;
    }
}
