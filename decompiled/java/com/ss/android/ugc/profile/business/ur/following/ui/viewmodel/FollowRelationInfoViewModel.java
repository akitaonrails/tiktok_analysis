package com.ss.android.ugc.profile.business.ur.following.ui.viewmodel;

import X.C1264900j1M;
import X.C1610760s1C;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS33S0001000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowRelationInfoViewModel extends AssemViewModel<C1264900j1M> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1264900j1M(0);
    }

    public final void vQ2(int i) {
        setState(new AwS33S0001000_19(i, 2));
        if (getState().LLILZLL == null) {
            setState(AFwS257S0000000_19.get$arr$(439));
            C1610760s1C c1610760s1C = getState().LLILZLL;
            if (c1610760s1C != null) {
                c1610760s1C.LIZIZ();
            }
        }
    }
}
