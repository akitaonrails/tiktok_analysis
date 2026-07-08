package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes2.dex */
public final class FcpConfigModelKt {
    public static final boolean isAvailable(ServerBaseFcpConfig serverBaseFcpConfig) {
        ServerBaseComponentConfig serverBaseComponentConfig;
        String str;
        if (serverBaseFcpConfig == null || (serverBaseComponentConfig = serverBaseFcpConfig.serverBaseComponentConfig) == null || (str = serverBaseComponentConfig.serverBaseComponentConfigHash) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean isAvailable(RealtimeFcpConfig realtimeFcpConfig) {
        if (realtimeFcpConfig == null || realtimeFcpConfig.realtimeComponentConfig == null) {
            return false;
        }
        return true;
    }
}
