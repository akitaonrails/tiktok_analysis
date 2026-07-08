package com.ss.android.ugc.tiktok.addyours.hub.viewmodel;

import X.AbstractC316870CbV;
import X.C0OEF;
import X.C0OEI;
import X.C317290CcB;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursHubTabViewModel extends AssemListViewModel<C0OEF, C0OEI, Long> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OEF(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0OEI> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 424));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, null, null, 7);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, null, null, 7);
    }
}
