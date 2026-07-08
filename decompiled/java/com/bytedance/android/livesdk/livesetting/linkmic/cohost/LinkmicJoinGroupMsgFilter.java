package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_join_group_msg_filter")
public final class LinkmicJoinGroupMsgFilter {
    public static final boolean DEFAULT = false;
    public static final LinkmicJoinGroupMsgFilter INSTANCE = new LinkmicJoinGroupMsgFilter();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_join_group_msg_filter", DEFAULT);
    }
}
