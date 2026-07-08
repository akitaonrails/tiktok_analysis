package com.ss.android.ugc.aweme.lemon.postmode.ui.common;

import X.C0HYF;
import X.C1355870lO5;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoSharedViewModel extends AssemViewModel<InterfaceC0148002o> implements C0HYF {
    public VideoItemParams LL;
    public Aweme LLILLJJLI;
    public PostModeDetailParams LLILLL;
    public C1355870lO5 LLILZ;

    @Override // X.C0HYF
    public final void D5(int i) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0lOK
        };
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.C0HYF
    public final PostModeDetailParams H() {
        return this.LLILLL;
    }

    @Override // X.C0HYF
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }
}
