package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_auto_match_join_group_direct_skip_quick_cohost_status_invited")
public final class CoHostAutoMatchJoinGroupDirectSkipQuickCohostStatusInvited {
    public static final boolean DEFAULT = true;
    public static final CoHostAutoMatchJoinGroupDirectSkipQuickCohostStatusInvited INSTANCE = new CoHostAutoMatchJoinGroupDirectSkipQuickCohostStatusInvited();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_auto_match_join_group_direct_skip_quick_cohost_status_invited", DEFAULT);
    }

    public final boolean actionEnabled() {
        return getValue();
    }
}
