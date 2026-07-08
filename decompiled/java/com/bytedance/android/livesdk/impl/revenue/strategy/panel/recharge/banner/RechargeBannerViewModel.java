package com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner;

import X.AbstractC316870CbV;
import X.C0KBN;
import X.C316650Cb9;
import X.C317290CcB;
import X.C325950Cq9;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeBannerViewModel extends AssemListViewModel<C325950Cq9, C0KBN, Integer> {
    public final TouchPointAbility LL;
    public int LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325950Cq9(0);
    }

    public RechargeBannerViewModel(TouchPointAbility touchPointAbility) {
        this.LL = touchPointAbility;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0KBN> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.13BV] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r10) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        IllegalStateException illegalStateException = new IllegalStateException("load more not supported");
        c317290CcB.getClass();
        return new C316650Cb9(illegalStateException);
    }
}
