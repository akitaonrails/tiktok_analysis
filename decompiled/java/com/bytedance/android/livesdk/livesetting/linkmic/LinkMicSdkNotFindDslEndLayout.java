package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_not_find_dsl_end_layout")
public final class LinkMicSdkNotFindDslEndLayout {
    public static final int DEFAULT = 1;
    public static final LinkMicSdkNotFindDslEndLayout INSTANCE = new LinkMicSdkNotFindDslEndLayout();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_sdk_not_find_dsl_end_layout", DEFAULT);
    }

    public final boolean anchorOrGuestEnable() {
        return (getValue() & 2) == 2;
    }

    public final boolean audienceEnable() {
        return (getValue() & 1) == 1;
    }
}
