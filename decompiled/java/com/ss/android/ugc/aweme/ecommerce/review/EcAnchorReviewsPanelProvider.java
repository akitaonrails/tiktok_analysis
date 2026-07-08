package com.ss.android.ugc.aweme.ecommerce.review;

import X.C1349800lEI;
import X.C18N9;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes33.dex */
public final class EcAnchorReviewsPanelProvider implements IPanelProviderProtocol {
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final int Kj1() {
        return 11;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final String PU0() {
        return "ec_reviews_tab";
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final Fragment ER0(C1349800lEI c1349800lEI, Aweme aweme) {
        EcAnchorReviewsPanelFragment ecAnchorReviewsPanelFragment = new EcAnchorReviewsPanelFragment();
        ecAnchorReviewsPanelFragment.LLILZ = aweme;
        ecAnchorReviewsPanelFragment.LLILZLL = c1349800lEI;
        ecAnchorReviewsPanelFragment.WR(aweme);
        return ecAnchorReviewsPanelFragment;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final boolean vJ0(C1349800lEI c1349800lEI, Aweme aweme) {
        return C18N9.LIZ(aweme);
    }
}
