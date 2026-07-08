package com.ss.android.ugc.profile.business.effect.topdesigner;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.profile.business.effect.dashboard.MarkDashboardEffectViewedReq;
import com.ss.android.ugc.profile.business.effect.dashboard.MarkDashboardEffectViewedResp;
import com.ss.android.ugc.profile.business.effect.dashboard.UnviewedDashboardEffectRsp;

/* JADX INFO: loaded from: classes30.dex */
public interface ITopDesignerBoardNetApi {
    @InterfaceC1501160pAQ("/tiktok/v1/effect/api/ttapp/popup-banner")
    C0X9S<UnviewedDashboardEffectRsp> getPopupBanners();

    @InterfaceC1501170pAR("/tiktok/v1/effect/api/ttapp/popup-banner/mark-viewed")
    C0X9S<MarkDashboardEffectViewedResp> markBannerAsViewed(@InterfaceC1485405rg MarkDashboardEffectViewedReq markDashboardEffectViewedReq);
}
