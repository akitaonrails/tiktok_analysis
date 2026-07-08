package com.bytedance.memrelief.optimize.common;

import X.C2188811AlT;
import com.bytedance.memrelief.utils.EnsureLoad;

/* JADX INFO: loaded from: classes5.dex */
public final class ALogHook {
    public static final ALogHook LIZ = new ALogHook();

    public static final native void close();

    public static final native void start(String[] strArr, boolean z, boolean z2);

    public static final native void update(boolean z);

    static {
        EnsureLoad.init();
    }

    public static void LIZ(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startInit filters:");
        sbLIZ.append("");
        sbLIZ.append(" forceCloseError:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        start(null, z, z2);
    }
}
