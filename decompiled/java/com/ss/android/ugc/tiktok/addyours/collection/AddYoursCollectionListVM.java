package com.ss.android.ugc.tiktok.addyours.collection;

import X.AbstractC316870CbV;
import X.C09YA;
import X.C614960OAc;
import X.C615070OAn;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursCollectionListVM extends AssemListViewModel<C614960OAc, C615070OAn, Long> {
    public final C09YA LL = new C09YA(this, AFwS195S0000000_9.get$arr$(360));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C614960OAc(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C615070OAn> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 422));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C614970OAd
            if (r0 == 0) goto L22
            r3 = r9
            X.0OAd r3 = (X.C614970OAd) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            r2 = 10
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            goto L4a
        L22:
            X.0OAd r3 = new X.0OAd
            r3.<init>(r6, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r5)
            X.09YA r0 = r6.LL     // Catch: java.lang.Exception -> L94
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L94
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Exception -> L94
            X.00hg r0 = r0.getOperator()     // Catch: java.lang.Exception -> L94
            X.0OAe r0 = (X.InterfaceC614980OAe) r0     // Catch: java.lang.Exception -> L94
            r3.LLILLL = r4     // Catch: java.lang.Exception -> L94
            java.lang.Object r5 = r0.w(r2, r7, r3)     // Catch: java.lang.Exception -> L94
            if (r5 != r1) goto L4d
            return r1
        L4a:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L94
        L4d:
            com.ss.android.ugc.tiktok.addyours.model.AddYoursCollectionTopicsResp r5 = (com.ss.android.ugc.tiktok.addyours.model.AddYoursCollectionTopicsResp) r5     // Catch: java.lang.Exception -> L94
            java.util.List<com.ss.android.ugc.aweme.addyours.model.AddYoursTopic> r1 = r5.topicList     // Catch: java.lang.Exception -> L94
            if (r1 == 0) goto L75
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L94
            int r0 = X.C15438062q.LJIJJ(r1, r2)     // Catch: java.lang.Exception -> L94
            r3.<init>(r0)     // Catch: java.lang.Exception -> L94
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L94
        L60:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L94
            com.ss.android.ugc.aweme.addyours.model.AddYoursTopic r1 = (com.ss.android.ugc.aweme.addyours.model.AddYoursTopic) r1     // Catch: java.lang.Exception -> L94
            X.0OAn r0 = new X.0OAn     // Catch: java.lang.Exception -> L94
            r0.<init>(r1)     // Catch: java.lang.Exception -> L94
            r3.add(r0)     // Catch: java.lang.Exception -> L94
            goto L60
        L75:
            X.13BV r3 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L94
        L77:
            boolean r0 = r5.hasMore     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L89
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L94
            long r0 = r5.cursor     // Catch: java.lang.Exception -> L94
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L94
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r0, r1, r3, r4)     // Catch: java.lang.Exception -> L94
            return r0
        L89:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L94
            r0.getClass()     // Catch: java.lang.Exception -> L94
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L94
            r0.<init>(r3)     // Catch: java.lang.Exception -> L94
            return r0
        L94:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
