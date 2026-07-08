package com.ss.android.ugc.aweme.ecommerce.ug.common.manager;

import X.C13BV;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgNetworkSaasBuilder implements INetworkSaasBuilder {
    @Override // com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder
    public final List<NetworkPartner> LIZ() {
        IEcUgCommonService iEcUgCommonService = (IEcUgCommonService) PluggableExtentionKt.pluggableSpi$default(IEcUgCommonService.class, false, false, false, 14, null);
        return Collections.singletonList(iEcUgCommonService != null ? iEcUgCommonService.LIZIZ() : null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.network.INetworkSaasBuilder
    public final C13BV LIZIZ() {
        return C13BV.INSTANCE;
    }
}
