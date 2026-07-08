package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.viewmodel;

import X.AbstractC316870CbV;
import X.C1731700vAG;
import X.C1731710vAH;
import X.C1731730vAJ;
import X.C317290CcB;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.HashSet;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductListViewModel extends AssemListViewModel<C1731710vAH, C1731700vAG, Integer> {
    public AwS605S0100000_26 LLILLJJLI;
    public final C1731730vAJ LL = new C1731730vAJ();
    public final HashSet<String> LLILLL = new HashSet<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1731710vAH(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1731700vAG> c627660Ojc) {
        setState(new AwS605S0100000_26(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 347));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, null, null, 7);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }
}
