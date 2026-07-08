package com.ss.android.ugc.aweme.comment.quickmention;

import X.C1347810lB5;
import X.C1347830lB7;
import X.EnumC1347820lB6;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes22.dex */
public final class QuickMentionVM extends AssemViewModel<C1347810lB5> {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1347810lB5(0);
    }

    public final void vQ2(EnumC1347820lB6 enumC1347820lB6) {
        setState(new C1347830lB7(enumC1347820lB6));
    }
}
