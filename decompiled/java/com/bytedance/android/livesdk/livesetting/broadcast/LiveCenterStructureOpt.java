package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_center_structure_opt")
public final class LiveCenterStructureOpt {
    public static final int DEFAULT = 0;
    public static final LiveCenterStructureOpt INSTANCE = new LiveCenterStructureOpt();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_center_structure_opt", DEFAULT) > 0;
    }
}
