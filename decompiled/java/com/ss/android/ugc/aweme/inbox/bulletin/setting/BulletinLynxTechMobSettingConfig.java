package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinLynxTechMobSettingConfig {
    public static final int $stable = 0;

    @C09CT("enable_fps_monitor_custom_param")
    public final Boolean enableFpsMonitorCustomParam;

    @C09CT("enable_get_first_screen")
    public final Boolean enableGetFirstScreen;

    public BulletinLynxTechMobSettingConfig() {
        this(Boolean.TRUE, Boolean.TRUE);
    }

    public BulletinLynxTechMobSettingConfig(Boolean bool, Boolean bool2) {
        this.enableGetFirstScreen = bool;
        this.enableFpsMonitorCustomParam = bool2;
    }
}
