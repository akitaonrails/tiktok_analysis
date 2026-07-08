package com.ss.android.ugc.aweme.compliance.consent.serviceimpl;

import X.C1876860ywO;
import X.C1915460zwe;
import X.C1915720zx4;
import X.EnumC1876780ywG;
import X.EnumC1915430zwb;
import X.EnumC683800Qry;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPIPOShareConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;

/* JADX INFO: loaded from: classes29.dex */
public final class PIPOShareConsentServiceImp implements IPIPOShareConsentService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPIPOShareConsentService
    public final void LIZ(C1915460zwe c1915460zwe) {
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() != null) {
            C1915720zx4.LJIIJ(c1915460zwe, "pipo", Collections.singletonList(new C1876860ywO(EnumC683800Qry.PIPO_SHARE_CONSENT.getKey(), EnumC1876780ywG.APPROVE, EnumC1915430zwb.PIPO_SHARE_CONSENT.getS(), null, null, null, 120)));
        }
    }
}
