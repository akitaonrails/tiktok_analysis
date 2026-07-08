package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "kyb_dm_tools")
public final class LivePcsKybDmToolsSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsKybDmToolsSetting INSTANCE = new LivePcsKybDmToolsSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("kyb_dm_tools", DEFAULT) == 1;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("kyb_dm_tools", DEFAULT);
    }
}
