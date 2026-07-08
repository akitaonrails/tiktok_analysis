package com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox.vm;

import X.C05RV;
import X.C1910220zoC;
import X.C889930Yvf;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SwitchCreatorInboxViewModel extends AssemViewModel<C1910220zoC> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1910220zoC(0);
    }

    public final void vQ2(C05RV c05rv) {
        if (getState().LLILLJJLI) {
            return;
        }
        setState(AFwS271S0000000_28.get$arr$(113));
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 84);
        c889930Yvf.getClass();
        C889930Yvf.LIZ(c05rv, "click_inbox_selection", awS607S0100000_28);
    }
}
