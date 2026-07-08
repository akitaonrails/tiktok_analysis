package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.viewmodel;

import X.C658860Psq;
import X.EnumC658850Psp;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaPlayStateVM extends AssemViewModel<C658860Psq> {
    public final void LJLIIIL() {
        setState(AFwS241S0000000_10.get$arr$(165));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C658860Psq(EnumC658850Psp.STOPPED);
    }

    public final void vQ2() {
        setState(AFwS241S0000000_10.get$arr$(166));
    }
}
