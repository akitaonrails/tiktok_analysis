package com.bytedance.ies.im.core.exp;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class IMSDKResolveMsgGapFixExp {
    public static final int DISABLED = 0;
    public static final String KEY = "imsdk_resolve_msg_gap_fix";
    public static final IMSDKResolveMsgGapFixExp INSTANCE = new IMSDKResolveMsgGapFixExp();
    public static final int V1 = 1;

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, KEY, true) == V1;
    }

    public final int getDISABLED() {
        return DISABLED;
    }

    public final int getV1() {
        return V1;
    }
}
