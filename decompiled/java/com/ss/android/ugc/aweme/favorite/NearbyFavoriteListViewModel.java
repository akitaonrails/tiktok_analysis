package com.ss.android.ugc.aweme.favorite;

import X.AbstractC316870CbV;
import X.C09YA;
import X.C1172070gbd;
import X.C1172080gbe;
import X.C1172110gbh;
import X.C1BWL;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1207490hWl;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFavoriteListViewModel extends AssemListViewModel<C1172070gbd, C1172110gbh, C1172080gbe> {
    public Long LLILLJJLI;
    public boolean LLILLL;
    public NearbyFavoritePageParams LLILZ;
    public final boolean LL = ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, C1BWL.LIZ());
    public final C09YA LLILZIL = new C09YA(this, AFwS206S0000000_18.get$arr$(107));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1172070gbd(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1172110gbh> c627660Ojc) {
        setState(new AwS384S0200000_18((C627660Ojc) c627660Ojc, (C627660Ojc<C1172110gbh>) this, (NearbyFavoriteListViewModel) 36));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1172080gbe>> interfaceC1364105Vn) {
        return vQ2(new C1172080gbe(0), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C1172080gbe c1172080gbe, InterfaceC1364105Vn<? super AbstractC316870CbV<C1172080gbe>> interfaceC1364105Vn) {
        return vQ2(c1172080gbe, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.C1172080gbe r15, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1172080gbe>> r16) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorite.NearbyFavoriteListViewModel.vQ2(X.0gbe, X.05Vn):java.lang.Object");
    }
}
