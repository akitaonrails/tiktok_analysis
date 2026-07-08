package com.ss.android.ugc.aweme.minis.page.main.morepanel.setting;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
public final class MinisShareToDMSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final MinisShareToDMSetting INSTANCE = new MinisShareToDMSetting();

    public final boolean isEnabled() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("minis_share_to_dm_android_enabled", false);
    }
}
