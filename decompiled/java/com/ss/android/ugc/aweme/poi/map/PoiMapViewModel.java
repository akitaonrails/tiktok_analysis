package com.ss.android.ugc.aweme.poi.map;

import X.C1179620gno;
import X.C11JF;
import X.EnumC1179630gnp;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapViewModel extends AssemViewModel<C1179620gno> {
    public C11JF LL;
    public Long LLILLJJLI;
    public Long LLILLL;
    public int LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1179620gno(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LL = null;
    }

    public final void vQ2(EnumC1179630gnp enumC1179630gnp) {
        setState(new AwS597S0100000_18(enumC1179630gnp, 384));
    }
}
