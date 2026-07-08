package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_union_channel_ab_fix")
public final class LinkMicUnionChannelAbFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicUnionChannelAbFix INSTANCE = new LinkMicUnionChannelAbFix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_union_channel_ab_fix", DEFAULT);
    }
}
