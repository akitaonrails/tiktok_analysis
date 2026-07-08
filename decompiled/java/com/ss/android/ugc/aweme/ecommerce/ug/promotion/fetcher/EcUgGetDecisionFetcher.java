package com.ss.android.ugc.aweme.ecommerce.ug.promotion.fetcher;

import X.C034S;
import X.C08JS;
import X.C098200Yq;
import X.C1120604Zw;
import X.C189200o6;
import X.C1AF0;
import X.C1AQS;
import X.InterfaceC1179204jO;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgGetDecisionFetcher implements InterfaceC1179204jO {
    private final String toJsonString(Object obj) {
        IECommerceHostService iECommerceHostService;
        Object c098200Yq;
        boolean z;
        String name;
        Object obj2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            c098200Yq = C08JS.LIZLLL(obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } else {
            try {
                c098200Yq = C08JS.LIZLLL(obj);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (String) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // X.InterfaceC1179204jO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchDiversionConfig(java.lang.String r9, java.lang.String r10, org.json.JSONObject r11, org.json.JSONObject r12, X.InterfaceC1364105Vn<? super java.lang.String> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof X.C05GS
            if (r0 == 0) goto L60
            r6 = r13
            X.05GS r6 = (X.C05GS) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            if (r0 == 0) goto L31
            if (r0 != r5) goto L68
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0X52 r1 = (X.C0X52) r1
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            T r0 = r0.data
            com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.EcUgDecisionGetResponse r0 = (com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.EcUgDecisionGetResponse) r0
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.diversionConfig
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            if (r12 == 0) goto L5e
            java.lang.String r0 = "scene_id"
            int r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r12, r0)
        L3c:
            X.01K1 r1 = X.C0NSL.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.IEcUgDecisionGetApi> r0 = com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.IEcUgDecisionGetApi.class
            java.lang.Object r3 = r1.create(r0)
            com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.IEcUgDecisionGetApi r3 = (com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.IEcUgDecisionGetApi) r3
            com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.EcUgDecisionGetReqParam r2 = new com.ss.android.ugc.aweme.ecommerce.ug.promotion.api.EcUgDecisionGetReqParam
            java.lang.Integer r1 = X.C2286608xc.LJ(r4)
            java.lang.String r0 = r8.toJsonString(r11)
            r2.<init>(r1, r9, r0)
            r6.LLILLL = r5
            java.lang.Object r1 = r3.getDecision(r2, r6)
            if (r1 != r7) goto L22
            return r7
        L5e:
            r4 = 0
            goto L3c
        L60:
            X.05GS r6 = new X.05GS
            r6.<init>(r8, r13)
            goto L12
        L66:
            r0 = 0
            return r0
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.promotion.fetcher.EcUgGetDecisionFetcher.fetchDiversionConfig(java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONObject, X.05Vn):java.lang.Object");
    }
}
