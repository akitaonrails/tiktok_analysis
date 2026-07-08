package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_more_panel_layout_opt")
public final class LiveToolbarMoreConfig {
    public static final int DEFAULT = 0;
    public static final LiveToolbarMoreConfig INSTANCE = new LiveToolbarMoreConfig();

    private final int getGroup() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_more_panel_layout_opt", DEFAULT);
    }

    public final boolean enableInteractionPanelOptimize() {
        return getGroup() > 1;
    }

    public final boolean enableInteractionPanelOptimizeByLine() {
        return getGroup() > 2;
    }
}
