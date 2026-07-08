package com.ss.android.ugc.aweme.commentv2.panel;

import X.C1349800lEI;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAppReviewPanelProvider implements IPanelProviderProtocol {
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final int Kj1() {
        return 12;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final String PU0() {
        return "ads_review_tab";
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final Fragment ER0(C1349800lEI c1349800lEI, Aweme aweme) {
        ICommerceCommentService iCommerceCommentServiceLIZJ;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iCommerceCommentServiceLIZJ = iCommerceService.LIZJ()) != null) {
            return iCommerceCommentServiceLIZJ.LJ(aweme);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final boolean vJ0(C1349800lEI c1349800lEI, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        IAccountUserService iAccountUserService;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getReviewArea() != null && (iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null)) != null && iAccountUserService.isLogin()) {
            return true;
        }
        return false;
    }
}
