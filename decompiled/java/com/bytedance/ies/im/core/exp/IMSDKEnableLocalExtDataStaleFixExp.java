package com.bytedance.ies.im.core.exp;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class IMSDKEnableLocalExtDataStaleFixExp {
    public static final String KEY = "imsdk_enable_local_ext_data_stale_fix";
    public static final int ONLINE = 0;
    public static final IMSDKEnableLocalExtDataStaleFixExp INSTANCE = new IMSDKEnableLocalExtDataStaleFixExp();
    public static final int V1 = 1;

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, KEY, true) == V1;
    }

    public final int getONLINE() {
        return ONLINE;
    }

    public final int getV1() {
        return V1;
    }
}
