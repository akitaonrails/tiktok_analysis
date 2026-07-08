package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C11NJ;
import X.C11S5;
import X.C159P;
import X.C159Q;
import X.C15J4;
import X.C1701940uOG;
import X.InterfaceC0148002o;
import Y.AfS200S0100000_31;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTrendingTopicSearchViewModel extends AssemViewModel<C159P> {
    public final List<VideoTrendingTopic> LL = new ArrayList();
    public String LLILLJJLI = "";
    public final C11NJ LLILLL = new C11NJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C159P(null, null);
    }

    public final void LJJZZIII(String str) {
        this.LLILLJJLI = str;
        getState();
        String str2 = this.LLILLJJLI;
        C159Q.LIZ.getClass();
        VideoTrendingTopicApi.LIZ.getClass();
        C15J4.LIZ().searchTrendingTopicList(str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS200S0100000_31(this, 15), new AfS200S0100000_31(this, 16));
    }
}
