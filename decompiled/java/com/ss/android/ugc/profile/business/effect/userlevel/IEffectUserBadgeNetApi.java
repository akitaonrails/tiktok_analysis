package com.ss.android.ugc.profile.business.effect.userlevel;

import X.C0X9P;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes15.dex */
public interface IEffectUserBadgeNetApi {
    @InterfaceC1501160pAQ("/tiktok/v1/effect/api/ttapp/badge/get-unclaimed-badge")
    C0X9S<TTAppGetUnclaimedBonusBadgeRsp> getUnclaimedBonusBadge();

    @C0X9P("/tiktok/v1/effect/api/ttapp/badge/mark-viewed")
    C0X9S<TTAppMarkBadgeViewedResp> markBadgeViewed(@InterfaceC1485405rg TTAppMarkBadgeViewedReq tTAppMarkBadgeViewedReq);
}
