package com.ss.android.ugc.aweme.input;

import X.C1354820lMO;
import X.C1361010lWN;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.jvm.internal.AwS128S0101000_21;
import kotlin.jvm.internal.AwS34S0001000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuInputVM extends AssemViewModel<C1354820lMO> {
    public C1361010lWN LL;
    public DanmakuViewModel LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1354820lMO(0);
    }

    public final void vQ2(int i, boolean z) {
        if (z) {
            setState(new AwS34S0001000_21(i, 6));
        } else {
            withState(new AwS128S0101000_21(this, i, 7));
        }
    }
}
