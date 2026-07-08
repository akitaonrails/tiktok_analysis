package com.ss.android.ugc.aweme.service.downgrade;

import X.C570390MYr;
import X.C570400MYs;
import X.C570410MYt;
import com.ss.android.ugc.aweme.service.INeoService;
import com.ss.android.ugc.aweme.service.IPublishXService;
import com.ss.android.ugc.aweme.service.ISparrowService;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultSparrowServiceImpl implements ISparrowService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MYr] */
    @Override // com.ss.android.ugc.aweme.service.ISparrowService
    public final C570390MYr LIZ() {
        return new INeoService() { // from class: X.0MYr
            @Override // com.ss.android.ugc.aweme.service.INeoService
            public final void LIZ() {
            }

            @Override // com.ss.android.ugc.aweme.service.INeoService
            public final void LIZIZ() {
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MYs] */
    @Override // com.ss.android.ugc.aweme.service.ISparrowService
    public final C570400MYs getDraftMonitorService() {
        return new Object() { // from class: X.0MYs
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MYt] */
    @Override // com.ss.android.ugc.aweme.service.ISparrowService
    public final C570410MYt getPublishXService() {
        return new IPublishXService() { // from class: X.0MYt
        };
    }
}
