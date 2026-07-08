package com.ss.android.ugc.aweme.business.common.dc;

import X.AnonymousClass0206;
import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C1720106oR;
import X.C189200o6;
import X.C1DFH;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SkylightCacheCleanupScheduler {
    public static volatile AnonymousClass0956 LIZLLL;
    public static final SkylightCacheCleanupScheduler LIZ = new SkylightCacheCleanupScheduler();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(157));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(59));

    public final void LIZIZ() {
        InterfaceC497601wk interfaceC497601wk;
        Object c098200Yq;
        if (LIZIZ.compareAndSet(false, true) && (interfaceC497601wk = (InterfaceC497601wk) LIZJ.getValue()) != null) {
            try {
                C1DFH c1dfh = C0PEM.LIZ;
                c098200Yq = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new SkylightCacheCleanupScheduler$ensureInstalled$1$1(this, null), 2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("SkylightDbCleanup", "ensureInstalled launch failed", thM5exceptionOrNullimpl);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C611020Nxs
            if (r0 == 0) goto La3
            r5 = r3
            X.0Nxs r5 = (X.C611020Nxs) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r5.LLILZ = r2
        L14:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r9 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L2d
            if (r0 == r8) goto L7b
            if (r0 != r7) goto Laa
            X.C155000ia.LIZIZ(r1)
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.01GW r12 = com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler.LJ
            java.lang.Object r2 = r12.getValue()
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            java.lang.String r3 = "last_row_cleanup_at"
            r0 = 0
            long r0 = r2.getLong(r3, r0)
            long r10 = r14 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            java.lang.Object r0 = r12.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r0.storeLong(r3, r14)
            com.ss.android.ugc.aweme.experiment.SkylightFullSceneDiskCacheConfig r0 = X.C596340NaC.LIZIZ()
            boolean r0 = r0.liveCacheEnable
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.experiment.SkylightFullSceneDiskCacheConfig r0 = X.C596340NaC.LIZIZ()
            long r2 = r0.liveCacheDuration
            long r0 = (long) r6
            long r2 = r2 * r0
            long r0 = r14 - r2
            X.0Nxx r10 = com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB.LL
            kotlin.Unit r3 = kotlin.Unit.LIZ
            X.0Nxt r2 = new X.0Nxt
            r2.<init>(r0, r9)
            r5.LL = r14
            r5.LLILZ = r8
            java.lang.Object r0 = r10.LJ(r5, r2, r3)
            if (r0 != r4) goto L80
            return r4
        L7b:
            long r14 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L80:
            com.ss.android.ugc.aweme.experiment.SkylightFullSceneDiskCacheConfig r0 = X.C596340NaC.LIZIZ()
            boolean r0 = r0.storyCacheEnable
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.experiment.SkylightFullSceneDiskCacheConfig r0 = X.C596340NaC.LIZIZ()
            long r2 = r0.storyCacheDuration
            long r0 = (long) r6
            long r2 = r2 * r0
            long r14 = r14 - r2
            X.0Nxx r2 = com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB.LL
            kotlin.Unit r1 = kotlin.Unit.LIZ
            X.0Nxu r0 = new X.0Nxu
            r0.<init>(r14, r9)
            r5.LLILZ = r7
            java.lang.Object r0 = r2.LJ(r5, r0, r1)
            if (r0 != r4) goto L2a
            return r4
        La3:
            X.0Nxs r5 = new X.0Nxs
            r5.<init>(r13, r3)
            goto L14
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler.LIZ(long, X.05Vn):java.lang.Object");
    }
}
