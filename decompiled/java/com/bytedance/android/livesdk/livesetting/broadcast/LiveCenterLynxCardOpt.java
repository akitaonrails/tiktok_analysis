package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_lynx_card_opt")
public final class LiveCenterLynxCardOpt {
    public static final int DEFAULT = 1;
    public static final LiveCenterLynxCardOpt INSTANCE = new LiveCenterLynxCardOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_center_lynx_card_opt", DEFAULT) == 1;
    }
}
