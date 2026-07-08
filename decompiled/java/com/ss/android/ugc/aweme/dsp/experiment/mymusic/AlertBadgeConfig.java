package com.ss.android.ugc.aweme.dsp.experiment.mymusic;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AlertBadgeConfig {

    @C09CT("profile_menu_panel_show_alert_badge_times")
    public final int profileMenuPanelShowAlertBadgeTimes;

    @C09CT("profile_menu_show_alert_badge_times")
    public final int profileMenuShowAlertBadgeTimes;

    public AlertBadgeConfig() {
        this(3, 3);
    }

    public AlertBadgeConfig(int i, int i2) {
        this.profileMenuShowAlertBadgeTimes = i;
        this.profileMenuPanelShowAlertBadgeTimes = i2;
    }
}
