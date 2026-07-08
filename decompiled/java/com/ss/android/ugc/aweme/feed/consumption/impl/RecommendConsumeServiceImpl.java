package com.ss.android.ugc.aweme.feed.consumption.impl;

import X.C1DD1;
import X.C2252031DCn;
import X.C300410Bq3;
import com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService;
import com.ss.android.ugc.aweme.utils.RecommendConsumeParams;

/* JADX INFO: loaded from: classes36.dex */
public final class RecommendConsumeServiceImpl implements IFeedRecommendConsumeService {
    @Override // com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService
    public final RecommendConsumeParams LIZ() {
        RecommendConsumeParams recommendConsumeParams;
        C2252031DCn c2252031DCn = C2252031DCn.LIZ;
        synchronized (c2252031DCn) {
            RecommendConsumeParams recommendConsumeParams2 = C2252031DCn.LJ;
            C1DD1 c1dd1 = C1DD1.LIZ;
            recommendConsumeParams2.setDay_view_time(Long.valueOf((!C300410Bq3.LIZ() ? -1L : C1DD1.LIZLLL.model.playTimeBefore) + c2252031DCn.LIZLLL()));
            recommendConsumeParams = C2252031DCn.LJ;
        }
        return recommendConsumeParams;
    }
}
