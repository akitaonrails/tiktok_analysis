package com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh;

import X.C0149002p;
import X.C1593970ra7;
import X.C1697810uHb;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes25.dex */
public final class AlgoRefreshVM extends AssemViewModel<C0149002p> {
    public static final ArrayList<String> LL = C1697810uHb.LJ("For You", "Popular", "HOME");

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1593970ra7.LIZ.getClass();
        return new C0149002p(Boolean.valueOf(C1593970ra7.LIZ()));
    }
}
