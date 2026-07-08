package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import X.C01GW;
import X.C1163820gOK;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1167890gUt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideosManageViewModel extends AssemViewModel<C1163820gOK> implements InterfaceC1167890gUt {
    public int LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 669));

    @Override // X.InterfaceC1167890gUt
    public final String ts0() {
        return "manage_video";
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1163820gOK(0);
    }

    @Override // X.InterfaceC1167890gUt
    public final String jv1() {
        return this.LL;
    }

    @Override // X.InterfaceC1167890gUt
    public final void FP0(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.LLILZIL = true;
        List<Aweme> list = ((C1163820gOK) this.vmDispatcher.getState()).LL;
        if (list != null) {
            Collections.swap(list, i, i2);
        }
        setState(AFwS256S0000000_18.get$arr$(189));
    }
}
