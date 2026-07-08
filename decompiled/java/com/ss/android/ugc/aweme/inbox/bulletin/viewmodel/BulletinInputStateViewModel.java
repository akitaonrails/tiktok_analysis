package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C0OSF;
import X.C0OWM;
import X.C619990OTl;
import X.EnumC620000OTm;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputStateViewModel extends AssemViewModel<C619990OTl> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C619990OTl(0);
    }

    public final boolean isFullScreen() {
        return getState().LL == C0OSF.FULL_SCREEN;
    }

    public final boolean vQ2() {
        return getState().LL == C0OSF.NORMAL && getState().LLILLJJLI == C0OWM.HIDE && getState().LLILLL == EnumC620000OTm.INPUT;
    }
}
