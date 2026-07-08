package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C04TD;
import com.ss.android.ugc.aweme.bytebench.EffectPanelPrefetchStrategy;
import com.ss.android.ugc.aweme.bytebench.ShootingEffectPanelPreloadExperiment;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectPrefetchPreloadConfigServiceImpl implements IEffectPrefetchPreloadConfigService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int leftPrefetchCount() {
        C01GW c01gw = EffectPanelPrefetchStrategy.LIZ;
        return EffectPanelPrefetchStrategy.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int leftPreloadCount() {
        C01GW c01gw = ShootingEffectPanelPreloadExperiment.LIZ;
        return ShootingEffectPanelPreloadExperiment.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public boolean propPanelPreloadEnabled() {
        return ((Boolean) ShootingEffectPanelPreloadExperiment.LIZIZ.getValue()).booleanValue() && ((ShootingEffectPanelPreloadExperiment.ShootEffectPanelPreloadConfig) ShootingEffectPanelPreloadExperiment.LIZ.getValue()).enablePropPanelPreload;
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int rightPrefetchCount() {
        C01GW c01gw = EffectPanelPrefetchStrategy.LIZ;
        return EffectPanelPrefetchStrategy.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int rightPreloadCount() {
        C01GW c01gw = ShootingEffectPanelPreloadExperiment.LIZ;
        return ShootingEffectPanelPreloadExperiment.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public boolean propPanelPrefetchEnabled() {
        return EffectPanelPrefetchStrategy.LIZJ();
    }

    public static IEffectPrefetchPreloadConfigService createIEffectPrefetchPreloadConfigServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IEffectPrefetchPreloadConfigService.class, z);
        if (objLIZ != null) {
            return (IEffectPrefetchPreloadConfigService) objLIZ;
        }
        if (C04TD.y4 == null) {
            synchronized (IEffectPrefetchPreloadConfigService.class) {
                if (C04TD.y4 == null) {
                    C04TD.y4 = new EffectPrefetchPreloadConfigServiceImpl();
                }
            }
        }
        return C04TD.y4;
    }
}
