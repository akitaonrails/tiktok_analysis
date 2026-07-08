package com.ss.android.ugc.aweme.feed.adapter;

import X.C1387930mDn;
import X.C2002007so;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;

/* JADX INFO: loaded from: classes22.dex */
public final class FypExposedCommentAvoidViewModel extends FeedBaseViewModel<C2002007so> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2002007so("", false);
    }

    public final void vQ2(String str) {
        if (str != null) {
            setStateImmediate(new C1387930mDn(str));
        }
    }
}
