package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_ab_info_anchor_list_change_update_opt")
public final class CohostAbInfoAnchorListChangeOpt {
    public static final boolean DEFAULT = true;
    public static final CohostAbInfoAnchorListChangeOpt INSTANCE = new CohostAbInfoAnchorListChangeOpt();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_ab_info_anchor_list_change_update_opt", DEFAULT);
    }
}
