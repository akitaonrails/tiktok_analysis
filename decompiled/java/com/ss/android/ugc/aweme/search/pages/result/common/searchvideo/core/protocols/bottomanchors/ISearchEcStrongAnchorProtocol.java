package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C0PT4;
import X.C659560Pty;
import X.C659600Pu2;
import X.C659620Pu4;
import X.EnumC660370PvH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ISearchEcStrongAnchorProtocol implements ISearchVideoAnchorPriorityProtocol {
    public static final ISearchEcStrongAnchorProtocol LL = new ISearchEcStrongAnchorProtocol();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final List<Integer> yD2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final EnumC660370PvH iY1(Aweme aweme) {
        return EnumC660370PvH.ECOMMERCE_STRONG;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol
    public final boolean od0(SearchMixFeed searchMixFeed, Aweme aweme, C0PT4 c0pt4) {
        EnhancedProduct.Style styleLIZJ;
        C659560Pty c659560Pty;
        if (c0pt4 == null || (c659560Pty = c0pt4.LIZ) == null || (styleLIZJ = c659560Pty.LJFF) == null) {
            if (aweme != null) {
                C659620Pu4.LLJILJILJ.getClass();
                styleLIZJ = C659600Pu2.LIZJ(aweme, null, null, null, null, "");
            } else {
                styleLIZJ = null;
            }
        }
        if (styleLIZJ != EnhancedProduct.Style.STYLE_STRONG && styleLIZJ != EnhancedProduct.Style.STYLE_STRONG_V2) {
            return false;
        }
        return true;
    }
}
