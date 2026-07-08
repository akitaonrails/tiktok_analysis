package com.ss.android.ugc.aweme.subscription.pgc.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
public final class PrivilegePageHideShareButtonEnabledExperiment {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final PrivilegePageHideShareButtonEnabledExperiment INSTANCE = new PrivilegePageHideShareButtonEnabledExperiment();

    public final boolean isEnabled() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("privilege_page_hide_share_button_enabled", true);
    }
}
