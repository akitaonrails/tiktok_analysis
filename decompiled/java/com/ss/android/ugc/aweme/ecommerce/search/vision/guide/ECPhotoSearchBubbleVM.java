package com.ss.android.ugc.aweme.ecommerce.search.vision.guide;

import X.C0QM4;
import X.C596080NZm;
import X.InterfaceC0148002o;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ECPhotoSearchBubbleVM extends AssemViewModel<C596080NZm> implements C0QM4 {
    @Override // X.C0QM4
    public final void LLZZ() {
        setState(AFwS240S0000000_9.get$arr$(78));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C596080NZm(null);
    }

    @Override // X.C0QM4
    public final void hm2(View view) {
        setState(new AwS588S0100000_9(view, 82));
    }
}
