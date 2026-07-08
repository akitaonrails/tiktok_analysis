package com.ss.android.ugc.aweme.ecommerce.saas;

import X.C1120604Zw;
import X.C1121904a9;
import X.C13BV;
import X.C2198521B2s;
import X.InterfaceC1063710dmr;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LegacyJSBService implements IEcommerceInternalJSBridgeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<Class<? extends InterfaceC1063710dmr>> LIZ() {
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        return (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJIIIZ) ? C13BV.INSTANCE : Collections.singletonList(C2198521B2s.class);
    }
}
