package com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model;

import X.C0S9Q;
import X.C1355990lOH;
import X.C1356000lOI;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC21693319v9;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeFullPageViewModel extends FeedBaseViewModel<C0S9Q> implements InterfaceC21693319v9 {
    public VideoItemParams LLILLJJLI;
    public boolean LLILZIL;
    public final C1355990lOH LL = new C1355990lOH();
    public int LLILLL = -1;
    public final C1356000lOI LLILZ = new C1356000lOI(new AwS565S0100000_21(this, 1705), new AwS565S0100000_21(this, 1706));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0S9Q(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21693319v9
    public final boolean ew() {
        return ((C0S9Q) getState()).LLILZIL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZ.LIZ();
    }

    @Override // X.InterfaceC21693319v9
    public final boolean H5() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC21693319v9
    @InterfaceC1294060jmO
    public final VideoItemParams d6() {
        return this.LLILLJJLI;
    }
}
