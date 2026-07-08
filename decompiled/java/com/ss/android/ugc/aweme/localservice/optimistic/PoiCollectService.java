package com.ss.android.ugc.aweme.localservice.optimistic;

import X.C09IC;
import X.C0O35;
import X.C0O38;
import X.C0O54;
import X.C1518305wz;
import X.C612220Nzo;
import X.C612230Nzp;
import X.C614810O9n;
import X.C614830O9p;
import X.C614840O9q;
import X.C823050WQl;
import X.InterfaceC346201Wa;
import Y.ARunnableS14S1200000_9;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiCollectService extends C0O38<C614810O9n> implements IPoiCollectService {
    public final String LIZLLL = "poi_collect";

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final InterfaceC346201Wa<C612220Nzo<C614810O9n>> subscribe() {
        C612230Nzp<C614810O9n> c612230NzpLJI = LJI();
        return c612230NzpLJI != null ? C09IC.LIZ(c612230NzpLJI.LIZJ) : C1518305wz.LL;
    }

    @Override // X.C0O38
    public final String LJFF() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final void LIZIZ(C614810O9n c614810O9n) {
        String str = c614810O9n.LIZ;
        if (str.length() != 0) {
            C823050WQl.LIZLLL().execute(new ARunnableS14S1200000_9(this, c614810O9n, str, 13));
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final void LIZJ(C614840O9q c614840O9q) {
        C612230Nzp<C614810O9n> c612230NzpLJI = LJI();
        if (c612230NzpLJI != null) {
            c612230NzpLJI.LIZIZ.add(c614840O9q);
        }
    }

    @Override // X.C0O38
    public final C0O35 LJII(C0O35 c0o35) {
        C614810O9n c614810O9n = (C614810O9n) c0o35;
        return new C614810O9n(c614810O9n.LIZ, c614810O9n.LIZJ, c614810O9n.LIZLLL, c614810O9n.LJ, c614810O9n.LJFF, !c614810O9n.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final void LIZLLL(C614810O9n c614810O9n, List list) {
        LJIIIIZZ(c614810O9n, new C0O54(c614810O9n, new C614830O9p(this)), true, list, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C614810O9n r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C614820O9o
            if (r0 == 0) goto L53
            r5 = r8
            X.0O9o r5 = (X.C614820O9o) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L59
            X.C155000ia.LIZIZ(r2)
        L22:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "end favorite request, response: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            return r2
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0O9r r0 = com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi.LIZ
            r0.getClass()
            java.lang.String r1 = com.ss.android.ugc.aweme.app.api.Api.LIZ
            java.lang.Class<com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi> r0 = com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi.class
            java.lang.Object r2 = X.C09S2.LIZJ(r0, r1)
            com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi r2 = (com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi) r2
            java.lang.String r1 = r7.LIZ
            boolean r0 = r7.LIZIZ
            r0 = r0 ^ 1
            r5.LLILLL = r3
            java.lang.Object r2 = r2.collectPoi(r1, r0, r5)
            if (r2 != r4) goto L22
            return r4
        L53:
            X.0O9o r5 = new X.0O9o
            r5.<init>(r6, r8)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.localservice.optimistic.PoiCollectService.LJIIIZ(X.0O9n, X.05Vn):java.lang.Object");
    }
}
