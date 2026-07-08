package com.ss.android.ugc.aweme.influencer.ecommercelive.common;

import X.C1741660vQK;
import X.EnumC1124020fM8;
import com.ss.android.ugc.aweme.ecommercelive.common.container.IEcommerceLiveLaunchService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcommerceInfluencerLaunchService implements IEcommerceLiveLaunchService {
    @Override // com.ss.android.ugc.aweme.ecommercelive.common.container.IEcommerceLiveLaunchService
    public final void launch() {
        if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ()) {
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR, AFwS268S0000000_26.get$arr$(333));
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_BROADCAST, AFwS268S0000000_26.get$arr$(334));
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_PREVIEW, AFwS268S0000000_26.get$arr$(335));
        }
    }
}
