package com.ss.android.ugc.aweme.net.preload;

import X.C04TD;
import X.C1499780p8C;
import com.bytedance.ies.ugc.aweme.network.IPowerPreload;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PowerPreloadServiceImpl implements IPowerPreload {
    public static IPowerPreload LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPowerPreload.class, false);
        if (objLIZ != null) {
            return (IPowerPreload) objLIZ;
        }
        if (C04TD.P2 == null) {
            synchronized (IPowerPreload.class) {
                if (C04TD.P2 == null) {
                    C04TD.P2 = new PowerPreloadServiceImpl();
                }
            }
        }
        return C04TD.P2;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IPowerPreload
    public final void LIZ(String str, Map<String, String> map) {
        if (str.length() == 0) {
            return;
        }
        C1499780p8C.LIZIZ(str, map);
    }
}
