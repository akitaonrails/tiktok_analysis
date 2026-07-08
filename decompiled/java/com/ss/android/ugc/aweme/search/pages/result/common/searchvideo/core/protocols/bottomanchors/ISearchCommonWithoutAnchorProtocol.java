package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C0PT4;
import X.C10IT;
import X.EnumC660370PvH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchCommonWithoutAnchorProtocol implements ISearchVideoAnchorPriorityProtocol {
    public static final ISearchCommonWithoutAnchorProtocol LL = new ISearchCommonWithoutAnchorProtocol();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.MAX_PRIORITY;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        if (aweme == null || !aweme.isAd()) {
            C10IT.LIZ.getClass();
            if (!C10IT.LJIIL(aweme)) {
                return false;
            }
        }
        return true;
    }
}
