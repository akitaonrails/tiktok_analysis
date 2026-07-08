package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_panel_user_status_refresh_monitor")
public final class LiveCohostPanelUserStatusRefreshMonitorSetting {
    public static final LiveCohostPanelUserStatusRefreshMonitorSetting INSTANCE = new LiveCohostPanelUserStatusRefreshMonitorSetting();
    public static final CoHostInviteListBtnStatusMonitorConfigs DEFAULT = new CoHostInviteListBtnStatusMonitorConfigs();

    public final CoHostInviteListBtnStatusMonitorConfigs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CoHostInviteListBtnStatusMonitorConfigs coHostInviteListBtnStatusMonitorConfigs = DEFAULT;
        CoHostInviteListBtnStatusMonitorConfigs coHostInviteListBtnStatusMonitorConfigs2 = (CoHostInviteListBtnStatusMonitorConfigs) settingsManager.getValueSafely("live_cohost_panel_user_status_refresh_monitor", coHostInviteListBtnStatusMonitorConfigs);
        return coHostInviteListBtnStatusMonitorConfigs2 != null ? coHostInviteListBtnStatusMonitorConfigs2 : coHostInviteListBtnStatusMonitorConfigs;
    }

    public final List<Integer> getEnableInviteeLists() {
        return getValue().inviteeLists;
    }

    public final List<Integer> getHitStatuses() {
        return getValue().hitStatuses;
    }

    public final Map<Integer, List<Integer>> getTransitions() {
        return getValue().transitions;
    }
}
