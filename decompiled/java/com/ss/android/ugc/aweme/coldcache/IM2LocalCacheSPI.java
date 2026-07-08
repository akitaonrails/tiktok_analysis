package com.ss.android.ugc.aweme.coldcache;

import X.C01GW;
import X.C0NE4;
import X.C0NE5;
import X.C0NGA;
import X.C2268981DrU;
import X.C23250099c;
import X.C305980Bz2;
import X.C581810Mrr;
import X.C590710NEv;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localcache.IM2LocalCacheService;
import defpackage.y0;
import defpackage.z0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class IM2LocalCacheSPI implements IM2LocalCacheService {
    @Override // com.ss.android.ugc.aweme.localcache.IM2LocalCacheService
    public final boolean LIZIZ() {
        C581810Mrr.LIZ.getClass();
        boolean z = C581810Mrr.LIZJ;
        C581810Mrr.LIZJ = false;
        if (z && ((Boolean) C305980Bz2.LIZ.getValue()).booleanValue()) {
            C581810Mrr.LIZLLL = System.currentTimeMillis();
            C581810Mrr.LJ = -1;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.localcache.IM2LocalCacheService
    public final void LIZJ(C0NGA c0nga) {
        C0NE5.LIZ.getClass();
        ((ArrayList) C0NE5.LIZIZ).remove(c0nga);
    }

    @Override // com.ss.android.ugc.aweme.localcache.IM2LocalCacheService
    public final void LJ(C0NGA c0nga) {
        C0NE5.LIZ.getClass();
        ((ArrayList) C0NE5.LIZIZ).add(c0nga);
    }

    @Override // com.ss.android.ugc.aweme.localcache.IM2LocalCacheService
    public final void LIZ(C0NE4 c0ne4, C590710NEv c590710NEv, AwS375S0200000_9 awS375S0200000_9) {
        z0.LIZ.LJ(c0ne4, c590710NEv, awS375S0200000_9);
    }

    @Override // com.ss.android.ugc.aweme.localcache.IM2LocalCacheService
    public final void LIZLLL(int i, long j, Aweme aweme) {
        int duration;
        z0 z0Var = z0.LIZ;
        synchronized (z0.class) {
            Video video = aweme.getVideo();
            if (video != null) {
                duration = video.getDuration();
            } else {
                duration = 0;
            }
            z0 z0Var2 = z0.LIZ;
            z0.LJI(i, j, aweme);
            if (z0.LIZJ(duration, aweme)) {
                AtomicInteger atomicInteger = z0.LJI;
                atomicInteger.incrementAndGet();
                if (((Boolean) C2268981DrU.LJFF.getValue()).booleanValue()) {
                    C23250099c.LIZLLL(z0.LIZIZ, null, null, new y0(aweme, duration, j, i, null), 3);
                }
                int i2 = atomicInteger.get();
                C01GW c01gw = C2268981DrU.LJ;
                int iIntValue = ((Number) c01gw.getValue()).intValue();
                if (1 <= iIntValue && iIntValue <= i2) {
                    if (((Boolean) C2268981DrU.LIZLLL.getValue()).booleanValue()) {
                        z0Var2.LJFF("historyVideoOnPlayStop");
                    } else if (!((Boolean) C2268981DrU.LJIIL.getValue()).booleanValue() && i2 == ((Number) c01gw.getValue()).intValue()) {
                        C0NE5 c0ne5 = C0NE5.LIZ;
                        C0NE4 c0ne4 = C0NE4.GOLDEN_CACHE;
                        c0ne5.getClass();
                        C0NE5.LIZ(c0ne4);
                    }
                }
            }
        }
    }
}
