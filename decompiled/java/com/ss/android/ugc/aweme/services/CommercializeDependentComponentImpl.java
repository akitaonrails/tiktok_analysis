package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.InterfaceC1029510cth;
import com.ss.android.ugc.aweme.commercialize.api.ICommercializeDependentComponentService;

/* JADX INFO: loaded from: classes17.dex */
public final class CommercializeDependentComponentImpl implements ICommercializeDependentComponentService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.commercialize.api.ICommercializeDependentComponentService
    public InterfaceC1029510cth adUtilsService() {
        return new AdUtilsServiceImpl();
    }

    public static ICommercializeDependentComponentService createICommercializeDependentComponentServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICommercializeDependentComponentService.class, z);
        if (objLIZ != null) {
            return (ICommercializeDependentComponentService) objLIZ;
        }
        return new CommercializeDependentComponentImpl();
    }
}
