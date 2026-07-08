package com.ss.android.ugc.aweme.poi.creator;

import X.AnonymousClass0956;
import X.C09R9;
import X.C1165730gRP;
import X.C1197360hGQ;
import X.C1197650hGt;
import X.C1197690hGx;
import X.C1197700hGy;
import X.C1197720hH0;
import X.C1198620hIS;
import X.C1199060hJA;
import X.C1199110hJF;
import X.C13LE;
import X.C627660Ojc;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatorVM extends AssemListViewModel<C1197360hGQ, C1198620hIS, C1197650hGt> {
    public static final /* synthetic */ int LLJILLL = 0;
    public PoiMobParam LLILLJJLI;
    public double LLILLL;
    public double LLILZ;
    public boolean LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public C1197690hGx LLIZLLLIL;
    public C1197720hH0 LLJ;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1199060hJA.class));
    public boolean LLIZ = vQ2();
    public final ConcurrentHashMap<String, String> LLJI = new ConcurrentHashMap<>();
    public final List<InterfaceC1891350zJl> LLJIJIL = Collections.synchronizedList(new ArrayList());
    public final C1199110hJF LLJILJIL = new C1199110hJF();
    public final C1197700hGy LLJILJILJ = new C1197700hGy();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1197360hGQ(0);
    }

    public final boolean vQ2() {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        C844470XAv.LIZ.getClass();
        return iLocationBaseServiceForMT.LJ(C844470XAv.LIZ()) && ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ() && ((this.LLILLL > 0.0d ? 1 : (this.LLILLL == 0.0d ? 0 : -1)) != 0 && (this.LLILZ > 0.0d ? 1 : (this.LLILZ == 0.0d ? 0 : -1)) != 0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1198620hIS> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 286));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1197650hGt>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1197590hGn
            if (r0 == 0) goto L20
            r5 = r7
            X.0hGn r5 = (X.C1197590hGn) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L5e
        L20:
            X.0hGn r5 = new X.0hGn
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            boolean r0 = r6.vQ2()
            r6.LLIZ = r0
            java.util.List<X.0zJl> r0 = r6.LLJIJIL
            r0.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r6.LLJI
            r0.clear()
            X.0hGx r0 = r6.LLIZLLLIL     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L5b
            X.0hH0 r0 = r0.LIZ()     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.LIZ     // Catch: java.lang.Exception -> L71
        L4d:
            X.0hGt r0 = new X.0hGt     // Catch: java.lang.Exception -> L71
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L71
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L71
            java.lang.Object r4 = r6.yQ2(r0, r5)     // Catch: java.lang.Exception -> L71
            if (r4 != r3) goto L61
            goto L5d
        L5b:
            r1 = 0
            goto L4d
        L5d:
            return r3
        L5e:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L71
        L61:
            X.0CbV r4 = (X.AbstractC316870CbV) r4     // Catch: java.lang.Exception -> L71
            boolean r0 = r4 instanceof X.C316650Cb9     // Catch: java.lang.Exception -> L71
            if (r0 != 0) goto L88
            r0 = 339(0x153, float:4.75E-43)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)     // Catch: java.lang.Exception -> L71
            r6.setState(r0)     // Catch: java.lang.Exception -> L71
            return r4
        L71:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            r0 = 340(0x154, float:4.76E-43)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r6.setState(r0)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r4 = new X.0Cb9
            r4.<init>(r1)
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM.onRefresh(X.05Vn):java.lang.Object");
    }

    public final void xQ2(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1197690hGx c1197690hGx = this.LLIZLLLIL;
        if (c1197690hGx != null) {
            c1197690hGx.LIZJ.add(new C1197720hH0(str, Long.valueOf(jCurrentTimeMillis), this.LLIZLLLIL, 88));
        }
        if (str == null || str.length() == 0) {
            this.LLJ = new C1197720hH0(null, Long.valueOf(jCurrentTimeMillis), null, 120);
        }
        setState(new AwS69S1000000_18(str, 2));
        manualListRefresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1197650hGt r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1197650hGt>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1197620hGq
            if (r0 == 0) goto L20
            r4 = r7
            X.0hGq r4 = (X.C1197620hGq) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L3a
        L20:
            X.0hGq r4 = new X.0hGq
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L40
            java.lang.Object r3 = r5.yQ2(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
        L3d:
            X.0CbV r3 = (X.AbstractC316870CbV) r3     // Catch: java.lang.Exception -> L40
            return r3
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r3 = new X.0Cb9
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM.onLoadMore(X.0hGt, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.C1197650hGt r74, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1197650hGt>> r75) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM.yQ2(X.0hGt, X.05Vn):java.lang.Object");
    }
}
