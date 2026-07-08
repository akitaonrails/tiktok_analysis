package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_get_common_pos_api")
public final class LinkMicFixGetCommonPosApi {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixGetCommonPosApi INSTANCE = new LinkMicFixGetCommonPosApi();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_get_common_pos_api", DEFAULT);
    }
}
