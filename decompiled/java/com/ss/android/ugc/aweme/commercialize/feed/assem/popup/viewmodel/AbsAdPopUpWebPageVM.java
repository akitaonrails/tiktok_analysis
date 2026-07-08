package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import X.C995980c1c;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsAdPopUpWebPageVM extends FeedBaseViewModel<C995980c1c> {
    public String LL;
    public long LLILLJJLI;
    public int LLILLL = -1;
    public boolean LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C995980c1c(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel, X.InterfaceC738070SxJ
    public final Object state2ItemAccept(InterfaceC0148002o interfaceC0148002o, Object obj) {
        return obj;
    }
}
