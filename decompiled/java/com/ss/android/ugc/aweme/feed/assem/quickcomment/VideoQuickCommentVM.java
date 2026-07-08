package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C1DFK;
import X.C23118094a;
import X.C733280Spa;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoQuickCommentVM extends FeedBaseViewModel<C733280Spa> {
    public JobSupport LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C733280Spa(null, null);
    }

    public VideoQuickCommentVM() {
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        c1dfkLIZ.LIZIZ(null);
        this.LL = c1dfkLIZ;
    }
}
