package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header;

import X.C04FG;
import X.C04FM;
import X.C04FN;
import X.C04FO;
import X.C04FT;
import X.InterfaceC0148002o;
import X.InterfaceC1053704Ad;
import X.InterfaceC746802vq;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpHeaderVM extends AssemViewModel<C04FT> {
    public final InterfaceC1053704Ad LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C04FT(0);
    }

    public final void vQ2() {
        C04FG c04fgLJ;
        C04FO c04fo;
        C04FM c04fm;
        List<C04FN> list;
        ArrayList arrayList = new ArrayList();
        InterfaceC1053704Ad interfaceC1053704Ad = this.LL;
        if (interfaceC1053704Ad != null && (c04fgLJ = interfaceC1053704Ad.LJ()) != null && (c04fo = c04fgLJ.LIZIZ) != null && (c04fm = c04fo.LJIIZILJ) != null && (list = c04fm.LJIILL) != null) {
            arrayList.addAll(list);
        }
        setState(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 254));
    }

    public PdpHeaderVM(InterfaceC1053704Ad interfaceC1053704Ad) {
        this.LL = interfaceC1053704Ad;
    }
}
