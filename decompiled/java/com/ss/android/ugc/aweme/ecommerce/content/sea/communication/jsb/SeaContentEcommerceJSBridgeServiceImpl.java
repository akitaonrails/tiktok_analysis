package com.ss.android.ugc.aweme.ecommerce.content.sea.communication.jsb;

import X.C13BV;
import X.C1697810uHb;
import X.C1AF0;
import X.C2188811AlT;
import X.C600350Ngf;
import X.C600360Ngg;
import X.C600370Ngh;
import X.C600680NhC;
import X.C600730NhH;
import X.InterfaceC1063710dmr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SeaContentEcommerceJSBridgeServiceImpl implements IEcommerceInternalJSBridgeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<Class<? extends InterfaceC1063710dmr>> LIZ() {
        try {
            return C1697810uHb.LJIILJJIL(C600350Ngf.class, C600360Ngg.class, C600680NhC.class, C600370Ngh.class, C600730NhH.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sea_content register jsb, exception msg=");
            sbLIZ.append(th.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
    }
}
