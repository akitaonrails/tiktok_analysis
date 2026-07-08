package com.ss.android.ugc.aweme.feed.api;

import X.C099G;
import X.C0C64;
import X.C1234490iEJ;
import X.C1234640iEY;
import X.C1234680iEc;
import X.C1554960qZC;
import X.C1584440rKk;
import X.C1602870roT;
import X.C19EG;
import X.C20684815ws;
import X.C2151308bn;
import X.C2196008j0;
import X.C2344009Gk;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfigExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class FeedModuleServiceImpl extends FeedModuleServiceCommonImpl {
    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final void attachActivityToGlobalAcViewModel(C19EG c19eg) {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final void initLegoInflate() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final void initPosterSRProcessorOnHotStart() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final void posterSRProcessorOnDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final int useInsertAwemeOperatorPosition() {
        int i = C1234490iEJ.LJ;
        C1234490iEJ.LJ = -1;
        return i;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final boolean autoRefreshInNUJ() {
        return NUJAutoRefreshConfigExp.isEnable();
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final C1584440rKk createData(Context context) {
        String string;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "for_you_new_translations", true, false)) {
            string = context.getResources().getString(R.string.vck);
        } else {
            string = context.getResources().getString(R.string.jsn);
        }
        return new C1584440rKk(context, "For You", string);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final void refreshComment(Fragment fragment) {
        if (fragment instanceof FeedRecommendFragment) {
            RecommendFeedFragmentPanel recommendFeedFragmentPanel = ((FeedRecommendFragment) fragment).LLIZLLLIL;
            recommendFeedFragmentPanel.LLLLJI(recommendFeedFragmentPanel.LLLLLJLJLL(), null, "tab_recommend", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final void getInsertAwemeInfoAsync(String str, String str2, boolean z) {
        String str3;
        C099G c099gLIZ = C2196008j0.LIZ(str);
        if (!z) {
            str3 = str2;
        } else {
            str3 = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ugdp_id", str3);
        c2344009Gk.LJIIIIZZ("aweme_id", str);
        C20684815ws.LJIILLIIL("aweme_detail_pre_fetch", c2344009Gk.LIZ);
        if (z) {
            C1554960qZC.LIZ(GScope.LL, new C2151308bn(c099gLIZ, str, str2), C2151308bn.class, "ug_short_long_async_insert_feed_aweme");
            return;
        }
        GScope gScope = GScope.LL;
        C1554960qZC.LIZ(gScope, new C1234640iEY(c099gLIZ, str, str2), C1234640iEY.class, "ug_async_insert_feed_aweme");
        if (!((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJZ()) {
            return;
        }
        C1554960qZC.LIZ(gScope, new C1234680iEc(0L, true, str, str2), C1234680iEc.class, "ug_deeplink_insert_feed_swipe_up_key");
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final void mobNuFeedRequest(String str, boolean z, List<? extends Aweme> list) {
        if (z) {
            C1602870roT.LIZIZ(str);
        } else {
            C1602870roT.LIZ(str, list);
        }
    }
}
