package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.C1069910dwr;
import X.C1720106oR;
import X.C19719912Dl;
import X.C2187451AjH;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class FFPMainFragmentVM extends AssemViewModel<C1069910dwr> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1069910dwr(0);
    }

    public final void vQ2(C19719912Dl c19719912Dl) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show ");
        sbLIZ.append(c19719912Dl.LJI());
        sbLIZ.append('!');
        C1720106oR.LJI("[ffp]_main", C2188811AlT.LIZIZ(sbLIZ));
        setStateImmediate(new AwS595S0100000_16(c19719912Dl, 4));
    }
}
