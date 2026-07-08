package com.ss.android.ugc.aweme.commerce.sdk.service;

import X.C04TD;
import com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;

/* JADX INFO: loaded from: classes33.dex */
public final class CommerceService extends EmptyCommerceService {
    public static ICommerceService createICommerceServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICommerceService.class, z);
        if (objLIZ != null) {
            return (ICommerceService) objLIZ;
        }
        if (C04TD.LLJJIJI == null) {
            synchronized (ICommerceService.class) {
                if (C04TD.LLJJIJI == null) {
                    C04TD.LLJJIJI = new CommerceService();
                }
            }
        }
        return C04TD.LLJJIJI;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0361  */
    @Override // com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService, com.ss.android.ugc.aweme.commerce.service.ICommerceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void logCommerceEvents(final java.lang.String r4, X.C18N0 r5) {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService.logCommerceEvents(java.lang.String, X.18N0):void");
    }
}
