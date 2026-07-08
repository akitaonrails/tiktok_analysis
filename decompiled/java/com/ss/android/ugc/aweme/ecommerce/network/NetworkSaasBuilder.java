package com.ss.android.ugc.aweme.ecommerce.network;

import X.C13BV;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomNetworkPartnerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkSaasBuilder implements INetworkSaasBuilder {
    @Override // com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder
    public final List<NetworkPartner> LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkPartner> it2 = ((IEcommerceMonitorService) ServiceManager.get().getService(IEcommerceMonitorService.class)).LIZ().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        Iterator<NetworkPartner> it3 = ((IEcomNetworkPartnerService) ServiceManager.get().getService(IEcomNetworkPartnerService.class)).LIZ().iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next());
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder
    public final C13BV LIZIZ() {
        return C13BV.INSTANCE;
    }
}
