package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C01GW;
import X.C11S5;
import X.C1573560r3C;
import X.C1613540s5g;
import X.C1701940uOG;
import X.C452501pT;
import X.C516201zk;
import X.EnumC1578460rB6;
import X.InterfaceC1612120s3O;
import Y.AfS172S0100000_3;
import Y.AfS3S0110100_24;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.MiniDramaNetworkApiService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS110S0110000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaNetworkApiServiceImpl implements MiniDramaNetworkApiService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(259));

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    @Override // com.ss.android.ugc.aweme.service.MiniDramaNetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.Long r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.model.PaidCollectionRecommendResponse> r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaNetworkApiServiceImpl.LIZIZ(java.lang.Long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    @Override // com.ss.android.ugc.aweme.service.MiniDramaNetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.Long r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1612290s3f
            if (r0 == 0) goto L88
            r6 = r9
            X.0s3f r6 = (X.C1612290s3f) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L52
            if (r0 != r3) goto L8f
            java.lang.Object r8 = r6.LL
            java.lang.Long r8 = (java.lang.Long) r8
            X.C155000ia.LIZIZ(r1)
        L27:
            com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse r1 = (com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse) r1
            if (r1 == 0) goto L8e
        L2b:
            int r0 = r1.status_code
            if (r0 != 0) goto L8e
            java.util.List r0 = r1.getEpisodeList()
            if (r0 == 0) goto L8e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r3) goto L8e
            X.0ruV r0 = com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService r0 = X.C1606610ruV.LIZ()
            if (r0 == 0) goto L51
            X.0s3Y r0 = r0.LIZLLL(r8)
            if (r0 == 0) goto L51
            r0.LJIIZILJ(r1)
        L51:
            return r1
        L52:
            X.C155000ia.LIZIZ(r1)
            X.0ruV r0 = com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService r0 = X.C1606610ruV.LIZ()
            if (r0 == 0) goto L6c
            X.0s3Y r0 = r0.LIZLLL(r8)
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse r1 = r0.ne()
            if (r1 != 0) goto L2b
        L6c:
            X.01GW r0 = r7.LIZIZ
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.service.IPaidContentService r2 = (com.ss.android.ugc.aweme.service.IPaidContentService) r2
            if (r8 == 0) goto L85
            long r0 = r8.longValue()
        L7a:
            r6.LL = r8
            r6.LLILZ = r3
            java.lang.Object r1 = r2.LIZLLL(r0, r6)
            if (r1 != r5) goto L27
            return r5
        L85:
            r0 = 0
            goto L7a
        L88:
            X.0s3f r6 = new X.0s3f
            r6.<init>(r7, r9)
            goto L12
        L8e:
            return r4
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaNetworkApiServiceImpl.LIZJ(java.lang.Long, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaNetworkApiService
    public final C1613540s5g LIZ(boolean z, long j, boolean z2, Function0 function0, AwS110S0110000_24 awS110S0110000_24, AwS603S0100000_24 awS603S0100000_24) {
        InterfaceC1612120s3O.LIZ.getClass();
        InterfaceC1612120s3O interfaceC1612120s3O = (InterfaceC1612120s3O) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1612120s3O.class);
        IDramaSharedApiPathService.LIZ.getClass();
        return new C1613540s5g(interfaceC1612120s3O.LIZ(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.ADD_TO_FAVORITE), j, z ? 1 : 0, z2).LJIILJJIL(new C516201zk(function0, 228)).LJIILL(new AfS3S0110100_24(this, j, z, 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS172S0100000_3((Object) awS110S0110000_24, 49), new AfS172S0100000_3((Object) awS603S0100000_24, 50)));
    }
}
