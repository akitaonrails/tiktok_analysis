package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel;

import X.C0PEM;
import X.C1813660xIS;
import X.C1813670xIT;
import X.C1813690xIV;
import X.C1816130xMR;
import X.C23250099c;
import X.EnumC1813530xIF;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplySettingViewModel extends AssemViewModel<C1816130xMR> {
    public final C1813690xIV LL = new C1813690xIV();
    public EnumC1813530xIF LLILLJJLI = EnumC1813530xIF.PUBLIC;
    public long LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1816130xMR(0);
    }

    public final void vQ2(boolean z) {
        setState(AFwS269S0000000_27.get$arr$(130));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1813660xIS(this, z, null), 2);
    }

    public final void wQ2(int i, int i2) {
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1813670xIT(this, i, i2, null), 2);
    }
}
