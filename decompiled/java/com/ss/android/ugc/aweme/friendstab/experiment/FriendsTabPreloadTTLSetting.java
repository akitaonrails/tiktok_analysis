package com.ss.android.ugc.aweme.friendstab.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabPreloadTTLSetting {
    public static final int DEFAULT = 600000;
    public static final FriendsTabPreloadTTLSetting INSTANCE = new FriendsTabPreloadTTLSetting();

    public final int getValue() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("friends_tab_preload_ttl_setting", DEFAULT);
    }
}
