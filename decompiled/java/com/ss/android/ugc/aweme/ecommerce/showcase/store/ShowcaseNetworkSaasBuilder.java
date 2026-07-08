package com.ss.android.ugc.aweme.ecommerce.showcase.store;

import X.C13BV;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ShowcaseNetworkSaasBuilder implements INetworkSaasBuilder {
    @Override // com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder
    public final List<NetworkPartner> LIZ() {
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        if (iECommerceShowcaseService != null) {
            iECommerceShowcaseService.LIZ();
        }
        return Collections.singletonList(null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder
    public final C13BV LIZIZ() {
        return C13BV.INSTANCE;
    }
}
