package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.C1158240gFK;
import X.InterfaceC0148002o;
import X.InterfaceC1605290rsN;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectBottomBarViewModel extends AssemViewModel<C1158240gFK> implements InterfaceC1605290rsN {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158240gFK(null);
    }

    @Override // X.InterfaceC1605290rsN
    public final void LLILLL(Aweme aweme) {
        setState(new AwS597S0100000_18(aweme, 253));
    }
}
