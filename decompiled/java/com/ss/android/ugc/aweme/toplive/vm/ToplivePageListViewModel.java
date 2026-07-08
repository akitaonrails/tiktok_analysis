package com.ss.android.ugc.aweme.toplive.vm;

import X.AbstractC316870CbV;
import X.AbstractC479160Iqg;
import X.AbstractC482420Ivw;
import X.C09YA;
import X.C2188811AlT;
import X.C316650Cb9;
import X.C482550Iw9;
import X.C482590IwD;
import X.C627660Ojc;
import X.EnumC323450Cm7;
import X.EnumC482480Iw2;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class ToplivePageListViewModel extends AssemListViewModel<C482550Iw9, AbstractC482420Ivw, C482590IwD> {
    public AbstractC316870CbV<C482590IwD> LL;
    public final C09YA LLILLJJLI = new C09YA(this, AFwS193S0000000_7.get$arr$(188));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C482550Iw9(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<AbstractC482420Ivw> c627660Ojc) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newState: newListState=");
        List<AbstractC482420Ivw> list = c627660Ojc.LLILZ;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS586S0100000_7(c627660Ojc, (C627660Ojc<AbstractC479160Iqg>) 316));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C482590IwD>> interfaceC1364105Vn) {
        return vQ2(true, interfaceC1364105Vn);
    }

    public final void wQ2(EnumC482480Iw2 enumC482480Iw2) {
        setState(new AwS586S0100000_7(enumC482480Iw2, 317));
        withState(new AwS586S0100000_7(this, 318));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C482590IwD c482590IwD, InterfaceC1364105Vn<? super AbstractC316870CbV<C482590IwD>> interfaceC1364105Vn) {
        return vQ2(false, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(boolean r10, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C482590IwD>> r11) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.toplive.vm.ToplivePageListViewModel.vQ2(boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<AbstractC482420Ivw> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<? extends AbstractC482420Ivw> list, List<? extends AbstractC482420Ivw> list2) {
        List<AbstractC482420Ivw> listOnLoadPageAddData = super.onLoadPageAddData(enumC323450Cm7, list, list2);
        if (enumC323450Cm7 == EnumC323450Cm7.Refresh && list2.isEmpty() && (this.LL instanceof C316650Cb9)) {
            return new ArrayList(list);
        }
        return listOnLoadPageAddData;
    }
}
