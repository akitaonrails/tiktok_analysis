package com.ss.android.ugc.aweme.influencer.ecommercelive.us.business.beforelive.banner;

import X.C1120440fGM;
import X.C1205800hU2;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import webcast.data.EcPreLiveChecklistData;
import webcast.data.SecondaryBannerComponent;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: loaded from: classes18.dex */
public final class GoLivePreviewEcomBannerDelegate {
    public static final int $stable = 0;

    public final boolean shouldShowSubBanner(SecondaryBannerComponent secondaryBannerComponent) {
        return true;
    }

    public final View createTopBannerView(Context context, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        EcPreLiveChecklistData ecPreLiveChecklistData = topRightBannerContainerComponent.ecPreliveChecklist;
        if (ecPreLiveChecklistData == null || ecPreLiveChecklistData.checkListStepData.isEmpty()) {
            return null;
        }
        return new C1120440fGM(context, null, 0);
    }

    public final View createSubBannerView(Context context, SecondaryBannerComponent secondaryBannerComponent, LifecycleOwner lifecycleOwner) {
        C1205800hU2 c1205800hU2 = new C1205800hU2(context);
        c1205800hU2.LIZ(secondaryBannerComponent);
        return c1205800hU2;
    }
}
