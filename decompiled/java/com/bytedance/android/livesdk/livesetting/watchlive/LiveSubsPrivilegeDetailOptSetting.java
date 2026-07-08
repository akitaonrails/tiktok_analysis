package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_subs_privilege_detail_optimize")
public final class LiveSubsPrivilegeDetailOptSetting {
    public static final LiveSubsPrivilegeDetailOptSetting INSTANCE = new LiveSubsPrivilegeDetailOptSetting();
    public static final LiveSubsPrivilegeDetailOptConfig DEFAULT = new LiveSubsPrivilegeDetailOptConfig(false, null, new ArrayList(), new ArrayList(), true, 2000, false);

    public final LiveSubsPrivilegeDetailOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig = DEFAULT;
        LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig2 = (LiveSubsPrivilegeDetailOptConfig) settingsManager.getValueSafely("live_subs_privilege_detail_optimize", liveSubsPrivilegeDetailOptConfig);
        return liveSubsPrivilegeDetailOptConfig2 != null ? liveSubsPrivilegeDetailOptConfig2 : liveSubsPrivilegeDetailOptConfig;
    }
}
