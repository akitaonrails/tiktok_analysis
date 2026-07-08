package com.ss.android.ugc.aweme.poi.collect;

import X.AbstractC316870CbV;
import X.C1172130gbj;
import X.C1172320gc2;
import X.C1172480gcI;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectListViewModel extends AssemListViewModel<C1172130gbj, C1172320gc2, C1172480gcI> {
    public Long LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1172130gbj(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1172320gc2> c627660Ojc) {
        setState(new AwS384S0200000_18((C627660Ojc) c627660Ojc, (C627660Ojc<C1172320gc2>) this, (PoiCollectListViewModel) 74));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1172480gcI>> interfaceC1364105Vn) {
        return vQ2(new C1172480gcI(0), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C1172480gcI c1172480gcI, InterfaceC1364105Vn<? super AbstractC316870CbV<C1172480gcI>> interfaceC1364105Vn) {
        return vQ2(c1172480gcI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.C1172480gcI r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1172480gcI>> r17) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.PoiCollectListViewModel.vQ2(X.0gcI, X.05Vn):java.lang.Object");
    }
}
