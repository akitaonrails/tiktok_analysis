package com.ss.android.ugc.aweme.poi.osp.assem;

import X.C1193040h9S;
import X.EnumC1192930h9H;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitSheetViewModel extends AssemViewModel<C1193040h9S> {
    public boolean LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1193040h9S(0);
    }

    public final void vQ2(EnumC1192930h9H enumC1192930h9H) {
        if (getState().LL == enumC1192930h9H) {
            setState(AFwS256S0000000_18.get$arr$(530));
        }
    }
}
