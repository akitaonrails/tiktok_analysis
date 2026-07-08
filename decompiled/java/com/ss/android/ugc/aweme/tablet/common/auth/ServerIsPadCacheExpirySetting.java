package com.ss.android.ugc.aweme.tablet.common.auth;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
public final class ServerIsPadCacheExpirySetting {
    public static final long DEFAULT = 0;
    public static final ServerIsPadCacheExpirySetting INSTANCE = new ServerIsPadCacheExpirySetting();

    public final long delayTimeMill() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJFF("server_is_pad_expiry_setting", 0L) * 1000 * ((long) 60) * ((long) 24);
    }
}
