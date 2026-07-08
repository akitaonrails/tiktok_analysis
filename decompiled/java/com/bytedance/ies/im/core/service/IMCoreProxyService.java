package com.bytedance.ies.im.core.service;

import X.C0YHX;
import X.C0YM2;
import X.C0YM4;
import X.C0YM6;
import X.C0YNW;
import X.C876310YZh;
import android.os.SystemClock;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;

/* JADX INFO: loaded from: classes15.dex */
public final class IMCoreProxyService implements IIMCoreProxyService {
    public static final long LIZIZ = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int LIZJ = 0;

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService
    public final C0YHX LIZ(C0YM2 c0ym2) {
        return C0YM4.LIZ(c0ym2).LJ();
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService
    public final C876310YZh LIZIZ(C0YM2 c0ym2) {
        C0YM6 c0ym6LIZ = C0YM4.LIZ(c0ym2);
        C876310YZh c876310YZh = c0ym6LIZ.LJIILJJIL;
        if (c876310YZh == null) {
            synchronized (c0ym6LIZ) {
                c876310YZh = c0ym6LIZ.LJIILJJIL;
                if (c876310YZh == null) {
                    C876310YZh c876310YZh2 = new C876310YZh(c0ym6LIZ.LJ(), c0ym6LIZ.LJIIJ(), c0ym6LIZ.LIZJ());
                    c0ym6LIZ.LJIILJJIL = c876310YZh2;
                    return c876310YZh2;
                }
            }
        }
        return c876310YZh;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService
    public final C0YNW LIZJ(C0YM2 c0ym2) {
        C0YM6 c0ym6LIZ = C0YM4.LIZ(c0ym2);
        C0YNW c0ynw = c0ym6LIZ.LJIILIIL;
        if (c0ynw == null) {
            synchronized (c0ym6LIZ) {
                c0ynw = c0ym6LIZ.LJIILIIL;
                if (c0ynw == null) {
                    C0YNW c0ynw2 = new C0YNW(c0ym6LIZ.LJ(), c0ym6LIZ.LIZ(), c0ym6LIZ.LJIIIIZZ(), c0ym6LIZ.LJI(), c0ym6LIZ.LJIIJJI(), c0ym6LIZ.LJII(), c0ym6LIZ.LJIIIZ(), c0ym6LIZ.LIZLLL(), c0ym6LIZ.LIZIZ(), c0ym6LIZ.LJFF(), c0ym6LIZ.LJIIJ());
                    c0ym6LIZ.LJIILIIL = c0ynw2;
                    return c0ynw2;
                }
            }
        }
        return c0ynw;
    }
}
