package com.ss.android.ugc.aweme.tako.otherpage.botcenter;

import X.C09R9;
import X.C13LE;
import X.C1576320r7e;
import X.C23250099c;
import X.C859380XnU;
import X.C859390XnV;
import X.C885790Yoz;
import X.InterfaceC0148002o;
import X.InterfaceC736910SvR;
import X.InterfaceC859420XnY;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class TakoBotCenterViewModel extends AssemViewModel<C1576320r7e> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C885790Yoz.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1576320r7e(0);
    }

    public final InterfaceC736910SvR<InterfaceC859420XnY> vQ2() {
        return (InterfaceC736910SvR) this.LL.getValue();
    }

    public final void wQ2() {
        if (!((InterfaceC859420XnY) vQ2().getOperator()).LJIJ()) {
            setState(AFwS248S0000000_14.get$arr$(330));
        }
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C859390XnV(this, null), 3);
    }

    public final void xQ2() {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C859380XnU(this, null), 3);
    }
}
