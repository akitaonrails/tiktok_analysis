package com.ss.android.ugc.aweme.poi.collect.slash;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1172480gcI;
import X.C1172490gcJ;
import X.C1175980ghw;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectListViewModelForSlashCell extends AssemListViewModel<C1172490gcJ, C1175980ghw, C1172480gcI> {
    public Long LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS206S0000000_18.get$arr$(288));
    public String LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1172490gcJ(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1175980ghw> c627660Ojc) {
        setState(new AwS384S0200000_18((C627660Ojc) c627660Ojc, (C627660Ojc<C1175980ghw>) this, (PoiCollectListViewModelForSlashCell) 76));
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.C1172480gcI r11, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1172480gcI>> r12) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.slash.PoiCollectListViewModelForSlashCell.vQ2(X.0gcI, X.05Vn):java.lang.Object");
    }
}
