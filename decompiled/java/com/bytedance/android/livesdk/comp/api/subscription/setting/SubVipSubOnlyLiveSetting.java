package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "sub_vip_sub_only_live")
public final class SubVipSubOnlyLiveSetting {
    public static final int DEFAULT = 1;
    public static final SubVipSubOnlyLiveSetting INSTANCE = new SubVipSubOnlyLiveSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("sub_vip_sub_only_live", DEFAULT) == 1;
    }
}
