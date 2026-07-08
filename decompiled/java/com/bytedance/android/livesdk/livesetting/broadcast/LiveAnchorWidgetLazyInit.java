package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_widget_lazy_init")
public final class LiveAnchorWidgetLazyInit {
    public static final int DEFAULT = 0;
    public static final LiveAnchorWidgetLazyInit INSTANCE = new LiveAnchorWidgetLazyInit();

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_widget_lazy_init", DEFAULT);
    }

    public final boolean enable() {
        return getSettingValue() > 0;
    }
}
