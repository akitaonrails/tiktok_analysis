package com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service;

import X.C1514430pVp;
import com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.ColdBootDowngradeMallExperiment;

/* JADX INFO: loaded from: classes5.dex */
public final class EcUgColdBootDowngradeImpl implements IEcUgColdBootDowngradeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService
    public final long LIZ() {
        return ColdBootDowngradeMallExperiment.LIZ().downgradeDelayTime;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService
    public final boolean LIZIZ() {
        return ColdBootDowngradeMallExperiment.LIZ().enableUgMainAssemDowngrade && !C1514430pVp.LIZLLL().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService
    public final boolean LIZJ() {
        return ColdBootDowngradeMallExperiment.LIZ().enableSearchMallBubbleComponentDowngrade;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService
    public final boolean LIZLLL() {
        return ColdBootDowngradeMallExperiment.LIZ().enableMallMainActivityAssemDowngrade;
    }
}
