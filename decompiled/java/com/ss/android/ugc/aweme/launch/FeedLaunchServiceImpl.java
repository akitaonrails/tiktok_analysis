package com.ss.android.ugc.aweme.launch;

import X.C1601310rlx;
import X.C1601330rlz;
import X.InterfaceC1601220rlo;
import com.ss.android.ugc.aweme.feed.IFeedLaunchService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedLaunchServiceImpl implements IFeedLaunchService {
    @Override // com.ss.android.ugc.aweme.feed.IFeedLaunchService
    public final boolean LIZ() {
        C1601330rlz c1601330rlz;
        FeedItemList feedItemList;
        List<Aweme> items;
        InterfaceC1601220rlo interfaceC1601220rloLIZ = C1601310rlx.LIZIZ.LIZ();
        if (!(interfaceC1601220rloLIZ instanceof C1601330rlz) || (c1601330rlz = (C1601330rlz) interfaceC1601220rloLIZ) == null || (feedItemList = c1601330rlz.LIZIZ) == null || (items = feedItemList.getItems()) == null) {
            return false;
        }
        Iterator<Aweme> it2 = items.iterator();
        while (it2.hasNext()) {
            if (it2.next().isAd()) {
                return true;
            }
        }
        return false;
    }
}
