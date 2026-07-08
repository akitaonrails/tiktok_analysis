package com.ss.android.ugc.aweme.feed.count.impl;

import X.C1DD0;
import X.C1DD1;
import X.C2183861AdU;
import X.C2252031DCn;
import X.C300410Bq3;
import Y.ARunnableS30S1100000_26;
import com.ss.android.ugc.aweme.count.IFeedPlayNumService;
import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;

/* JADX INFO: loaded from: classes36.dex */
public final class FeedPlayNumServiceImpl implements IFeedPlayNumService {
    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void LIZ() {
        C1DD1 c1dd1 = C1DD1.LIZ;
        if (C300410Bq3.LIZ()) {
            C1DD0 c1dd0 = C1DD1.LIZIZ;
            c1dd0.LIZIZ(C1DD1.LIZLLL);
            C1DD1.LIZLLL = c1dd0.LIZ(C1DD1.LIZJ.LJIIJ().getCurUserId());
        }
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void LIZIZ() {
        C1DD1 c1dd1 = C1DD1.LIZ;
        if (C300410Bq3.LIZ()) {
            C1DD0 c1dd0 = C1DD1.LIZIZ;
            c1dd0.LIZIZ(C1DD1.LIZLLL);
            C1DD1.LIZLLL = c1dd0.LIZ(C1DD1.LIZJ.LJIIJ().getCurUserId());
        }
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void LIZJ() {
        C1DD1 c1dd1 = C1DD1.LIZ;
        if (C300410Bq3.LIZ()) {
            C1DD0 c1dd0 = C1DD1.LIZIZ;
            String str = C1DD1.LIZLLL.uid;
            c1dd0.getClass();
            if (C300410Bq3.LIZ()) {
                new ARunnableS30S1100000_26(c1dd0, str, 4).run();
            }
            UserPlayNum userPlayNumLIZ = c1dd0.LIZ(C1DD1.LIZJ.LJIIJ().getCurUserId());
            C1DD1.LIZLLL.setUid(userPlayNumLIZ.uid);
            FeedPlayNumModel feedPlayNumModel = C1DD1.LIZLLL.model;
            feedPlayNumModel.setBatchNum(feedPlayNumModel.batchNum + userPlayNumLIZ.model.batchNum);
            FeedPlayNumModel feedPlayNumModel2 = C1DD1.LIZLLL.model;
            feedPlayNumModel2.setBatchNumAll(feedPlayNumModel2.batchNumAll + userPlayNumLIZ.model.batchNumAll);
            FeedPlayNumModel feedPlayNumModel3 = C1DD1.LIZLLL.model;
            feedPlayNumModel3.setPlayNum(feedPlayNumModel3.playNum + userPlayNumLIZ.model.playNum);
            FeedPlayNumModel feedPlayNumModel4 = C1DD1.LIZLLL.model;
            feedPlayNumModel4.setPlayNumAll(feedPlayNumModel4.playNumAll + userPlayNumLIZ.model.playNumAll);
            c1dd0.LIZIZ(C1DD1.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void a4() {
        C1DD1 c1dd1 = C1DD1.LIZ;
        if (C300410Bq3.LIZ()) {
            FeedPlayNumModel feedPlayNumModel = C1DD1.LIZLLL.model;
            feedPlayNumModel.setPlayTimeBefore(feedPlayNumModel.playTimeBefore + C2252031DCn.LIZ.LIZLLL());
            C1DD1.LIZIZ.LIZIZ(C1DD1.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final int e4() {
        return (int) C2183861AdU.LIZ.LIZLLL().getLong("key_day_view_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final int b4() {
        return C1DD1.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final int c4() {
        return C1DD1.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final int d4() {
        return C1DD1.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final int f4() {
        return C1DD1.LIZ();
    }
}
