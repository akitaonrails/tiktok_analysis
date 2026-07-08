package com.ss.android.ugc.aweme.compliance.business.userbehavior;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C1519110pdN;
import X.C2211631BhB;
import X.C452501pT;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.services.userbehavior.IUITransitionService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes24.dex */
public final class UITransitionServiceImpl implements IUITransitionService {
    public long LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1519110pdN());

    @Override // com.ss.android.ugc.aweme.compliance.api.services.userbehavior.IUITransitionService
    public final void LIZ(View view, Object obj) {
        final WeakReference weakReference = new WeakReference(obj);
        C2211631BhB.LIZLLL(view, new AbstractC2211791BhR(this, weakReference) { // from class: X.0pdM
            public final C1519090pdL LJ;

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJ;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0pdL] */
            {
                this.LJ = new InterfaceC2211931Bhf() { // from class: X.0pdL
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
                    @Override // X.InterfaceC2211931Bhf
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(android.view.View r9, java.lang.String r10) {
                        /*
                            r8 = this;
                            long r2 = java.lang.System.currentTimeMillis()
                            com.ss.android.ugc.aweme.compliance.business.userbehavior.UITransitionServiceImpl r0 = r1
                            long r0 = r0.LIZ
                            long r6 = r2 - r0
                            r4 = 500(0x1f4, double:2.47E-321)
                            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                            if (r0 > 0) goto L11
                            return
                        L11:
                            java.lang.ref.WeakReference<java.lang.Object> r0 = r2
                            java.lang.Object r6 = r0.get()
                            if (r6 != 0) goto L1a
                            return
                        L1a:
                            com.ss.android.ugc.aweme.compliance.business.userbehavior.UITransitionServiceImpl r0 = r1
                            r0.getClass()
                            r5 = 0
                            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L3f
                            java.lang.String r0 = "_pnsPageId"
                            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L3f
                            r0 = 1
                            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L3f
                            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L3f
                            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3f
                            if (r0 == 0) goto L86
                            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3f
                            if (r1 == 0) goto L86
                            java.lang.String r4 = X.C08GP.LIZ(r1)     // Catch: java.lang.Throwable -> L3f
                            goto L60
                        L3f:
                            r4 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                            java.lang.String r0 = "getPnsPageId failed, Exception = "
                            r1.append(r0)
                            r1.append(r4)
                            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                            X.C1AF0.LJFF(r4, r0)
                            java.lang.Class r0 = r6.getClass()
                            java.lang.String r4 = r0.getCanonicalName()
                            if (r4 == 0) goto L86
                        L60:
                            com.ss.android.ugc.aweme.compliance.business.userbehavior.UITransitionServiceImpl r0 = r1
                            X.01GW r0 = r0.LIZIZ
                            java.lang.Object r0 = r0.getValue()
                            X.0pdJ r0 = (X.InterfaceC1519070pdJ) r0
                            if (r0 == 0) goto L89
                            java.util.concurrent.CopyOnWriteArrayList r0 = r0.LIZJ()
                            if (r0 == 0) goto L89
                            java.util.Iterator r1 = r0.iterator()
                        L76:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L89
                            java.lang.Object r0 = r1.next()
                            X.0pdK r0 = (X.InterfaceC1519080pdK) r0
                            r0.LIZIZ(r4, r5)
                            goto L76
                        L86:
                            java.lang.String r4 = ""
                            goto L60
                        L89:
                            com.ss.android.ugc.aweme.compliance.business.userbehavior.UITransitionServiceImpl r0 = r1
                            r0.LIZ = r2
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1519090pdL.LIZ(android.view.View, java.lang.String):void");
                    }
                };
            }
        });
    }
}
