package com.ss.android.ugc.aweme.di;

import X.C1606620ruW;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService;
import com.ss.android.ugc.aweme.im.service.IIMService;

/* JADX INFO: loaded from: classes25.dex */
public class ImEntranceService implements IIMEntranceService {
    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService
    public final void init(IIMService iIMService) {
        if (iIMService != null) {
            iIMService.initialize(new C1606620ruW());
        }
    }
}
