package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body;

import X.C04CS;
import X.C04DG;
import X.C0QSJ;
import X.C13LE;
import X.C1457905nF;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BodyGroupCoordinator extends LogicAssem implements C04DG, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final BodyGroupCoordinator LL = this;
    public final Map<String, C1457905nF> LLILLJJLI = new LinkedHashMap();
    public volatile C04CS LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BodyGroupCoordinator.class, "pdpEventTrackingAbility", "getPdpEventTrackingAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/sdet/IPDPEventTrackingAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((LinkedHashMap) this.LLILLJJLI).clear();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, C04DG.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[Catch: all -> 0x0043, PHI: r1
      0x0037: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:10:0x0019, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x0013, B:9:0x0017, B:11:0x001b, B:13:0x001f, B:14:0x0025, B:18:0x003f, B:19:0x0041, B:17:0x0037), top: B:28:0x0013 }] */
    @Override // X.C04DG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1457905nF i3(X.C04FM r8) {
        /*
            r7 = this;
            java.util.Map<java.lang.String, X.05nF> r6 = r7.LLILLJJLI
            java.lang.String r5 = r8.LJIIIZ
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r4 = r6.get(r5)
            if (r4 != 0) goto L4d
            X.05nF r4 = new X.05nF
            X.04CS r0 = r7.LLILLL
            if (r0 != 0) goto L47
            monitor-enter(r7)
            X.04CS r0 = r7.LLILLL     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L46
            X.0QSJ r1 = r7.LLILZIL     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L37
            X.0Q7z r3 = r7.LLILZ     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L25
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r7)     // Catch: java.lang.Throwable -> L43
            r7.LLILZ = r3     // Catch: java.lang.Throwable -> L43
        L25:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L43
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L43
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L43
            r7.LLILZIL = r1     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L37
            r0 = 0
            goto L3f
        L37:
            java.lang.Class<X.04CS> r0 = X.C04CS.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L43
            X.04CS r0 = (X.C04CS) r0     // Catch: java.lang.Throwable -> L43
        L3f:
            r7.LLILLL = r0     // Catch: java.lang.Throwable -> L43
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L46:
            monitor-exit(r7)
        L47:
            r4.<init>(r8, r0)
            r6.put(r5, r4)
        L4d:
            X.05nF r4 = (X.C1457905nF) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.BodyGroupCoordinator.i3(X.04FM):X.05nF");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, C04DG.class);
    }
}
