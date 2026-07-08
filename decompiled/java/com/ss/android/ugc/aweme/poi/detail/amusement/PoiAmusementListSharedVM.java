package com.ss.android.ugc.aweme.poi.detail.amusement;

import X.AbstractC316870CbV;
import X.C0PEM;
import X.C1180260goq;
import X.C208000r8;
import X.C2189821An6;
import X.C23250099c;
import X.C322870ClB;
import X.C322880ClC;
import X.C612710O1l;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.amusement.model.PoiAmusementDataModel;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAmusementListSharedVM extends BaseDetailShareVM<C612710O1l, InterfaceC1891350zJl, C1180260goq> {
    public C1180260goq LLILZIL = new C1180260goq(0, 1);
    public PoiAmusementDataModel LLILZLL;
    public PoiAmusementDataModel LLIZ;
    public String LLIZLLLIL;
    public List<SlashEvent> LLJ;
    public String LLJI;
    public InterfaceC1181010gq3 LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 46;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String BQ2() {
        /*
            r6 = this;
            java.lang.String r0 = r6.LLJILJILJ
            if (r0 != 0) goto L7b
            java.util.List<com.ss.android.ugc.aweme.slash.data.SlashEvent> r0 = r6.LLJ
            if (r0 == 0) goto L7b
            r4 = 0
            X.04rF r5 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        Lf:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L64
            r0 = r2
            com.ss.android.ugc.aweme.slash.data.SlashEvent r0 = (com.ss.android.ugc.aweme.slash.data.SlashEvent) r0     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "load_more"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto Lf
        L28:
            com.ss.android.ugc.aweme.slash.data.SlashEvent r2 = (com.ss.android.ugc.aweme.slash.data.SlashEvent) r2     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L60
            java.util.List r0 = r2.getActions()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L60
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        L36:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L64
            r0 = r2
            com.ss.android.ugc.aweme.slash.data.SlashEventAction r0 = (com.ss.android.ugc.aweme.slash.data.SlashEventAction) r0     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r0.type     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "request"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L36
        L4d:
            com.ss.android.ugc.aweme.slash.data.SlashEventAction r2 = (com.ss.android.ugc.aweme.slash.data.SlashEventAction) r2     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L60
            com.ss.android.ugc.aweme.slash.data.SlashParam r0 = r2.slashParam     // Catch: java.lang.Throwable -> L64
        L53:
            r5.getClass()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = X.C1227904rF.LJI(r0)     // Catch: java.lang.Throwable -> L64
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L64
            goto L70
        L5e:
            r2 = r4
            goto L4d
        L60:
            r0 = r4
            goto L53
        L62:
            r2 = r4
            goto L28
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L70:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L77
            r4 = r1
        L77:
            java.lang.String r4 = (java.lang.String) r4
            r6.LLJILJILJ = r4
        L7b:
            java.lang.String r0 = r6.LLJILJILJ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM.BQ2():java.lang.String");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C612710O1l(0);
    }

    public PoiAmusementListSharedVM() {
        new ArrayList();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322870ClB(this, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C1180260goq c1180260goq = (C1180260goq) obj;
        super.manualListLoadMore(c1180260goq);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322880ClC(this, c1180260goq, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS375S0200000_9(this, (PoiAmusementListSharedVM) c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 92));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1180260goq>> interfaceC1364105Vn) {
        C1180260goq c1180260goq = new C1180260goq(0L, 1);
        this.LLILZIL = c1180260goq;
        return onLoadMore(c1180260goq, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if ((interfaceC1891350zJl instanceof C208000r8) && Intrinsics.LJFF(((C208000r8) interfaceC1891350zJl).LL.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C208000r8) {
            return ((C208000r8) interfaceC1891350zJl).LL;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.C1180260goq r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM.CQ2(X.0goq, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13BV] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: DQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1180260goq r14, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1180260goq>> r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM.onLoadMore(X.0goq, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1180260goq yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLILZIL;
    }
}
