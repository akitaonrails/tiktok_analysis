package com.ss.android.ugc.nearby.roaming;

import X.C0XF1;
import X.C1165730gRP;
import X.C1183600guE;
import X.C11S5;
import X.C1201620hNI;
import X.C1201730hNT;
import X.C1201850hNf;
import X.C1499850p8J;
import X.C1701940uOG;
import X.C627660Ojc;
import X.C844470XAv;
import X.InterfaceC0148002o;
import Y.AfS187S0100000_18;
import Y.AfS7S0100100_18;
import android.util.LruCache;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class RegionSearchViewModel extends AssemListViewModel<C1201730hNT, Object, C1201850hNf> {
    public static final /* synthetic */ int LLILLL = 0;
    public final LruCache<String, NearbyRegionSearchV1Response> LL = new LruCache<>(16);
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1201730hNT(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<Object> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 610));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1201850hNf>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1201820hNc
            if (r0 == 0) goto L20
            r4 = r6
            X.0hNc r4 = (X.C1201820hNc) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L56
        L20:
            X.0hNc r4 = new X.0hNc
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Exception -> L67
            r0.getClass()     // Catch: java.lang.Exception -> L67
            android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: java.lang.Exception -> L67
            boolean r0 = X.C0XF1.LIZLLL(r0)     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L5c
            X.0hNf r1 = new X.0hNf     // Catch: java.lang.Exception -> L67
            X.002o r0 = r5.getState()     // Catch: java.lang.Exception -> L67
            X.0hNT r0 = (X.C1201730hNT) r0     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r0.LL     // Catch: java.lang.Exception -> L67
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L67
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L67
            java.lang.Object r1 = r5.xQ2(r1, r4)     // Catch: java.lang.Exception -> L67
            if (r1 != r3) goto L59
            return r3
        L56:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L67
        L59:
            X.0CbV r1 = (X.AbstractC316870CbV) r1     // Catch: java.lang.Exception -> L67
            return r1
        L5c:
            X.0Cb9 r1 = new X.0Cb9     // Catch: java.lang.Exception -> L67
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L67
            r0.<init>()     // Catch: java.lang.Exception -> L67
            r1.<init>(r0)     // Catch: java.lang.Exception -> L67
            return r1
        L67:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0hNn r2 = X.C1201930hNn.LIZ
            X.002o r0 = r5.getState()
            X.0hNT r0 = (X.C1201730hNT) r0
            java.lang.String r1 = r0.LL
            r2.getClass()
            r0 = 0
            X.C1201930hNn.LIZIZ(r1, r0)
            X.0Cb9 r1 = new X.0Cb9
            r1.<init>(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.roaming.RegionSearchViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1201850hNf r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1201850hNf>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1201830hNd
            if (r0 == 0) goto L22
            r4 = r7
            X.0hNd r4 = (X.C1201830hNd) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            X.0hNf r6 = r4.LL
            goto L3e
        L22:
            X.0hNd r4 = new X.0hNd
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6     // Catch: java.lang.Exception -> L44
            r4.LLILZ = r0     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r5.xQ2(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            X.0CbV r3 = (X.AbstractC316870CbV) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0hNn r0 = X.C1201930hNn.LIZ
            java.lang.String r1 = r6.LIZIZ
            r0.getClass()
            r0 = 0
            X.C1201930hNn.LIZIZ(r1, r0)
            X.0Cb9 r3 = new X.0Cb9
            r3.<init>(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.roaming.RegionSearchViewModel.onLoadMore(X.0hNf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.C1201850hNf r10, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1201850hNf>> r11) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.roaming.RegionSearchViewModel.xQ2(X.0hNf, X.05Vn):java.lang.Object");
    }

    public final void vQ2(String str, String str2, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            C1201620hNI c1201620hNI = C1201620hNI.LIZ;
            c1201620hNI.getClass();
            c1201620hNI.LIZJ("nearby_revamp_change_region", new C1183600guE(false, -1, 0));
            setState(AFwS256S0000000_18.get$arr$(807));
            return;
        }
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = 0;
        ((RegionListApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(RegionListApi.class)).fetchNearbyRegionList(new NearbyRegionListV1Request(str, str2, z)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS7S0100100_18(jCurrentTimeMillis, this, 3), new AfS187S0100000_18(this, 48));
    }
}
