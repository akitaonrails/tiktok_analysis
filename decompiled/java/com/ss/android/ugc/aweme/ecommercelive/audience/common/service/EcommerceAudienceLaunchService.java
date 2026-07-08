package com.ss.android.ugc.aweme.ecommercelive.audience.common.service;

import X.C1741660vQK;
import X.C21353118hN;
import X.EnumC1124020fM8;
import com.ss.android.ugc.aweme.ecommercelive.common.container.IEcommerceLiveLaunchService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcommerceAudienceLaunchService implements IEcommerceLiveLaunchService {
    @Override // com.ss.android.ugc.aweme.ecommercelive.common.container.IEcommerceLiveLaunchService
    public final void launch() {
        C21353118hN.LL.LJI();
        if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ()) {
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE, AFwS268S0000000_26.get$arr$(314));
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_WATCHER, AFwS268S0000000_26.get$arr$(315));
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_EC_WATCHER_WATERMARK, AFwS268S0000000_26.get$arr$(316));
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_ACTING_AREA, AFwS268S0000000_26.get$arr$(317));
            C1741660vQK.LIZIZ(EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_BOTTOM_RIGHT_ACTING_AREA, AFwS268S0000000_26.get$arr$(318));
        }
    }
}
