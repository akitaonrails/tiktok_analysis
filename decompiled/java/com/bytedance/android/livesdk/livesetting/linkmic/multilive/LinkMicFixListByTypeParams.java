package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_rtc_fix_list_by_type")
public final class LinkMicFixListByTypeParams {
    public static final LinkMicFixListByTypeParams INSTANCE = new LinkMicFixListByTypeParams();
    public static final int DEFAULT = 1;

    public static final boolean isEnable() {
        return INSTANCE.getValue() > 0;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rtc_fix_list_by_type", DEFAULT);
    }
}
