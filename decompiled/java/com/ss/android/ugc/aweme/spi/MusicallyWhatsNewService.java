package com.ss.android.ugc.aweme.spi;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IComplianceOfflineService;

/* JADX INFO: loaded from: classes3.dex */
public final class MusicallyWhatsNewService implements IWhatsNewService {
    @Override // com.ss.android.ugc.aweme.spi.IWhatsNewService
    public final String LIZ() {
        IComplianceOfflineService iComplianceOfflineService = (IComplianceOfflineService) PluggableExtentionKt.pluggableSpi$default(IComplianceOfflineService.class, false, false, false, 14, null);
        if (iComplianceOfflineService != null) {
            iComplianceOfflineService.LIZ();
        }
        return null;
    }
}
