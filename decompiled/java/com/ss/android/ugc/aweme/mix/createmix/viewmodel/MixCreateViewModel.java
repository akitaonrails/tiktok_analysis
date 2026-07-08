package com.ss.android.ugc.aweme.mix.createmix.viewmodel;

import X.C01GW;
import X.C1163880gOQ;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1167890gUt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MixCreateViewModel extends AssemViewModel<C1163880gOQ> implements InterfaceC1167890gUt {
    public Aweme LLILZ;
    public boolean LLILZIL;
    public UrlModel LLILZLL;
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(189));

    @Override // X.InterfaceC1167890gUt
    public final String ts0() {
        return "create_playlist";
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1163880gOQ(0);
    }

    public final String vQ2() {
        String str = ((C1163880gOQ) this.vmDispatcher.getState()).LLILZIL;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1167890gUt
    public final String jv1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1167890gUt
    public final void FP0(int i, int i2) {
        List<Aweme> list;
        if (i != i2 && (list = ((C1163880gOQ) this.vmDispatcher.getState()).LLILLL) != null) {
            Collections.swap(list, i, i2);
        }
    }
}
