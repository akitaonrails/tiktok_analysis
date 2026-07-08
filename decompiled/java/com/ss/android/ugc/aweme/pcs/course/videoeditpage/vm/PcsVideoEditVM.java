package com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm;

import X.C489550JHt;
import X.EnumC489460JHk;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVideoEditVM extends AssemViewModel<C489550JHt> {
    public InterfaceC665370Q7z LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C489550JHt(0);
    }

    public final void vQ2(EnumC489460JHk enumC489460JHk) {
        setState(new AwS586S0100000_7(enumC489460JHk, 259));
    }
}
