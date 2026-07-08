package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("mg_cohost_widget_loading_opt")
public final class MgCohostWidgetLoadingOpt {
    public static final int DEFAULT = 1;
    public static final MgCohostWidgetLoadingOpt INSTANCE = new MgCohostWidgetLoadingOpt();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mg_cohost_widget_loading_opt", DEFAULT);
    }

    public final boolean shouldIdentifyCohostFirst() {
        return getValue() == 1;
    }
}
