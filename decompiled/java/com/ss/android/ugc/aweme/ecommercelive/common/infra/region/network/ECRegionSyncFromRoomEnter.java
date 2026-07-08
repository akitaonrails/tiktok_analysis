package com.ss.android.ugc.aweme.ecommercelive.common.infra.region.network;

import X.C1733990vDx;
import X.EnumC21192017wU;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle.IEcommerceRoomNewLifecycle;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.annotation.EcommerceRegion;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes33.dex */
@EcommerceRegion(priority = 0)
public final class ECRegionSyncFromRoomEnter implements IEcommerceRoomNewLifecycle {
    @Override // com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle.IEcommerceRoomNewLifecycle
    public final void LIZ(Room room) {
        IECommerceRegionService iECommerceRegionService;
        if (room != null && (iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null)) != null) {
            iECommerceRegionService.LIZIZ(room.getIdStr(), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle.IEcommerceRoomNewLifecycle
    public final void LIZIZ(Room room) {
        IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
        if (iECommerceRegionService != null && iECommerceRegionService.isEnable()) {
            OecInitData oecInitDataLIZ = C1733990vDx.LIZ(room);
            if (oecInitDataLIZ != null) {
                iECommerceRegionService.LJI(EnumC21192017wU.ROOM, oecInitDataLIZ.regionInfo, room.getRequestId(), null);
            }
            iECommerceRegionService.LIZIZ(room.getIdStr(), false);
        }
    }
}
