package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_remove_swipe_widget_exp")
public final class LiveRemoveSwipeWidgetExp {
    public static final boolean ENABLE = true;
    public static final LiveRemoveSwipeWidgetExp INSTANCE = new LiveRemoveSwipeWidgetExp();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_remove_swipe_widget_exp", DEFAULT);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
