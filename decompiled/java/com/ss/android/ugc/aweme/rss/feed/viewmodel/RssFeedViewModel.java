package com.ss.android.ugc.aweme.rss.feed.viewmodel;

import X.C1158890gGN;
import X.C1165270gQf;
import X.C1321590kUn;
import X.InterfaceC0148002o;
import X.InterfaceC1165170gQV;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam;

/* JADX INFO: loaded from: classes19.dex */
public final class RssFeedViewModel extends AssemViewModel<C1158890gGN> {
    public final RssFeedParam LL;
    public final InterfaceC1165170gQV LLILLJJLI;
    public String LLILLL;
    public RssArticle LLILZ;
    public final C1321590kUn LLILZIL = new C1321590kUn();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158890gGN(0);
    }

    public RssFeedViewModel(RssFeedParam rssFeedParam, C1165270gQf c1165270gQf) {
        this.LL = rssFeedParam;
        this.LLILLJJLI = c1165270gQf;
        this.LLILLL = rssFeedParam.getRssFeedUrl();
    }
}
