package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_auto_match_join_group_direct_proceed_message")
public final class CoHostAutoMatchJoinGroupDirectProceedMessage {
    public static final boolean DEFAULT = true;
    public static final CoHostAutoMatchJoinGroupDirectProceedMessage INSTANCE = new CoHostAutoMatchJoinGroupDirectProceedMessage();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_auto_match_join_group_direct_proceed_message", DEFAULT);
    }

    public final boolean actionEnabled() {
        return getValue();
    }
}
