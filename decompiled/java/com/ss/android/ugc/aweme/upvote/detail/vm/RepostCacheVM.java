package com.ss.android.ugc.aweme.upvote.detail.vm;

import X.C0154002u;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class RepostCacheVM extends FeedBaseViewModel<InterfaceC0148002o> {
    public final Map<String, String> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0154002u(0);
    }
}
