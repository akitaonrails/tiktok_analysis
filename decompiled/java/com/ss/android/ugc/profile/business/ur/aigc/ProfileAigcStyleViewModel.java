package com.ss.android.ugc.profile.business.ur.aigc;

import X.C08CX;
import X.C0NPQ;
import X.C0NPS;
import X.C13BV;
import X.C13LP;
import X.C1770850wBP;
import X.C2217381BqS;
import X.C23250099c;
import X.C291001Au;
import X.C817503Hh;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileAigcStyleViewModel extends AssemViewModel<C0NPS> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0NPS(new C291001Au(C13BV.INSTANCE), new C291001Au(C08CX.INSTANCE));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C0NPQ(this, null), 3);
    }

    public final boolean vQ2() {
        return getState().LLILLJJLI.LIZ.size() < 5;
    }

    public final void xQ2(AIGCStyle aIGCStyle, boolean z) {
        Set setLLIIIZ = C13LP.LLIIIZ(getState().LLILLJJLI.LIZ);
        if (z) {
            setLLIIIZ.add(aIGCStyle);
        } else {
            setLLIIIZ.remove(aIGCStyle);
        }
        setState(new AwS588S0100000_9(setLLIIIZ, (Set<AIGCStyle>) 421));
    }

    public static void wQ2(ProfileAigcStyleViewModel profileAigcStyleViewModel, C2217381BqS c2217381BqS, Function1 function1) {
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(true);
        AssemViewModel.selectSubscribe$default(profileAigcStyleViewModel, c2217381BqS, c1770850wBP, null, null, function1, 8, null);
    }
}
