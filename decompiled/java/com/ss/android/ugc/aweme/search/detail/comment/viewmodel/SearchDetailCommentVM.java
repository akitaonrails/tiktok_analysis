package com.ss.android.ugc.aweme.search.detail.comment.viewmodel;

import X.C01GW;
import X.C0PRC;
import X.C448230Hht;
import X.C448260Hhw;
import X.C452501pT;
import X.C646370PWx;
import X.C680810Qn9;
import X.InterfaceC0148002o;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchDetailCommentVM extends AssemViewModel<C448260Hhw> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(123));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C448260Hhw(0);
    }

    public final <T extends C680810Qn9<T>> void vQ2(C680810Qn9<T> c680810Qn9) {
        C0PRC c0prc = (C0PRC) ((ISearchContextAbility) this.LL.getValue()).Ph1().LIZJ();
        c680810Qn9.LJIJJ(((C646370PWx) ((ISearchContextAbility) this.LL.getValue()).wO2().LIZJ()).LLILLL);
        c680810Qn9.LJJIIZI(c0prc.LLILLL);
        c680810Qn9.LJJIJ(c0prc.LLIZLLLIL);
    }

    public final void wQ2(Aweme aweme, long j, Fragment fragment, VideoItemParams videoItemParams) {
        if (aweme == null) {
            return;
        }
        withState(new C448230Hht(j, this, aweme, videoItemParams, fragment));
    }
}
