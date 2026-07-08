package com.ss.android.ugc.aweme.anchor;

import X.AnonymousClass0956;
import X.C01GW;
import X.C11NJ;
import X.C1222290hud;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AddAnchorViewModel extends AssemViewModel<C1222290hud> {
    public AnonymousClass0956 LLILLJJLI;
    public String LLILZ;
    public String LLILZIL;
    public String LL = "";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(52));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1222290hud(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LLILLL.getValue()).dispose();
    }
}
