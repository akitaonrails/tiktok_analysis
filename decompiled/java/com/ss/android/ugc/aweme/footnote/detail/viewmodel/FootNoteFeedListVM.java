package com.ss.android.ugc.aweme.footnote.detail.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C09YA;
import X.C1845500y7o;
import X.C207800r6;
import X.C2189821An6;
import X.C2217401BqU;
import X.C627260Oiy;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1816030xMH;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class FootNoteFeedListVM extends BaseDetailShareVM<C1845500y7o, C207800r6, Integer> {
    public final C09YA LLILZIL = new C09YA(this, AFwS216S0000000_27.get$arr$(117));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 124;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1845500y7o(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        Context context = fragment.getContext();
        if (context == null) {
            super.init(fragment);
            return true;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0y7t
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        super.init(fragment);
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C207800r6> c627660Ojc) {
        setState(new AwS606S0100000_27(c627660Ojc, (C627660Ojc<InterfaceC1816030xMH>) 104));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1845530y7r
            if (r0 == 0) goto L20
            r6 = r8
            X.0y7r r6 = (X.C1845530y7r) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L55
        L20:
            X.0y7r r6 = new X.0y7r
            r6.<init>(r7, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r5)
            X.09YA r0 = r7.LLILZIL     // Catch: java.lang.Exception -> Lb6
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Lb6
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Exception -> Lb6
            X.00hg r2 = r0.getOperator()     // Catch: java.lang.Exception -> Lb6
            X.0y7v r2 = (X.InterfaceC1845570y7v) r2     // Catch: java.lang.Exception -> Lb6
            X.0y7y r1 = new X.0y7y     // Catch: java.lang.Exception -> Lb6
            X.002o r0 = r7.getState()     // Catch: java.lang.Exception -> Lb6
            X.0y7o r0 = (X.C1845500y7o) r0     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = r0.LLILLL     // Catch: java.lang.Exception -> Lb6
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lb6
            r6.LLILLL = r4     // Catch: java.lang.Exception -> Lb6
            com.ss.android.ugc.aweme.footnote.detail.repo.FootNoteFeedItemList r5 = r2.LLLLLLLZIL(r1)     // Catch: java.lang.Exception -> Lb6
            if (r5 != r3) goto L58
            return r3
        L55:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> Lb6
        L58:
            com.ss.android.ugc.aweme.footnote.detail.repo.FootNoteFeedItemList r5 = (com.ss.android.ugc.aweme.footnote.detail.repo.FootNoteFeedItemList) r5     // Catch: java.lang.Exception -> Lb6
            if (r5 != 0) goto L63
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lb6
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)     // Catch: java.lang.Exception -> Lb6
            return r0
        L63:
            java.util.List r1 = r5.getItems()     // Catch: java.lang.Exception -> Lb6
            if (r1 == 0) goto L8d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb6
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> Lb6
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lb6
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Lb6
        L78:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lb6
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> Lb6
            X.00r6 r0 = new X.00r6     // Catch: java.lang.Exception -> Lb6
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb6
            r3.add(r0)     // Catch: java.lang.Exception -> Lb6
            goto L78
        L8d:
            X.13BV r3 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> Lb6
        L8f:
            kotlin.jvm.internal.AwS606S0100000_27 r1 = new kotlin.jvm.internal.AwS606S0100000_27     // Catch: java.lang.Exception -> Lb6
            r0 = 106(0x6a, float:1.49E-43)
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> Lb6
            r7.setState(r1)     // Catch: java.lang.Exception -> Lb6
            boolean r0 = r5.isHasMore()     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto Lab
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r1 = X.C2286608xc.LJ(r4)     // Catch: java.lang.Exception -> Lb6
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lb6
            return r0
        Lab:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lb6
            r0.getClass()     // Catch: java.lang.Exception -> Lb6
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> Lb6
            r0.<init>(r3)     // Catch: java.lang.Exception -> Lb6
            return r0
        Lb6:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.footnote.detail.viewmodel.FootNoteFeedListVM.onRefresh(X.05Vn):java.lang.Object");
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
                if (Intrinsics.LJFF(((C207800r6) it2.next()).LL.getAid(), str)) {
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
        return ((C207800r6) interfaceC1891350zJl).LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r8, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r9) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.footnote.detail.viewmodel.FootNoteFeedListVM.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).intValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>>) interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        int size;
        C1845500y7o c1845500y7o = (C1845500y7o) getState();
        c1845500y7o.getClass();
        List listLIZ = C627260Oiy.LIZ(c1845500y7o);
        if (listLIZ != null) {
            size = listLIZ.size();
        } else {
            size = 0;
        }
        return Integer.valueOf(size);
    }
}
