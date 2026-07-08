package com.ss.android.ugc.aweme.detail.ui.pdp;

import X.C0SPE;
import X.C14EU;
import X.C1578630rBN;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes25.dex */
public final class SeaPdpCreatorVideoFeedFragment extends DetailPageFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEpPS46JGs5IGHELIOSEjLDViGioyGCE8Cj02KTEjOxk6LCAjDyo2LAM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1578630rBN.LJI(3, this);
    }

    @C14EU
    public final void onScrollToProfileEvent(C0SPE c0spe) {
        Aweme awemeLJIIIIZZ;
        DetailFragmentPanel detailFragmentPanel = this.LL;
        if (detailFragmentPanel != null && (awemeLJIIIIZZ = detailFragmentPanel.LJIIIIZZ()) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", AwemeExtKt.getAuthorUid(awemeLJIIIIZZ));
            smartRouteBuildRoute.withParam("sec_userid", AwemeExtKt.getSecAuthorUid(awemeLJIIIIZZ));
            smartRouteBuildRoute.withParam("enter_from", this.LLILLJJLI.getFrom());
            smartRouteBuildRoute.withParam("extra_from_pre_page", this.LLILLJJLI.getLogExtra().get("previous_page"));
            smartRouteBuildRoute.withParam("enter_method", c0spe.LIZJ);
            smartRouteBuildRoute.withParam(c0spe.LIZIZ);
            smartRouteBuildRoute.open();
        }
    }
}
