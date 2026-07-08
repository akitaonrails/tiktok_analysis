package com.ss.android.ugc.aweme.purchasepanel.service;

import X.C04TD;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.service.IPurchasePanelService;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasePanelService implements IPurchasePanelService {
    public static IPurchasePanelService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPurchasePanelService.class, false);
        if (objLIZ != null) {
            return (IPurchasePanelService) objLIZ;
        }
        if (C04TD.l3 == null) {
            synchronized (IPurchasePanelService.class) {
                if (C04TD.l3 == null) {
                    C04TD.l3 = new PurchasePanelService();
                }
            }
        }
        return C04TD.l3;
    }

    @Override // com.ss.android.ugc.aweme.service.IPurchasePanelService
    public final Object LIZ(String str, InterfaceC1364105Vn<? super PurchasePanelResponse> interfaceC1364105Vn) {
        return PurchasePanelApi.LIZ.LIZ(str, "", interfaceC1364105Vn);
    }
}
