package com.ss.android.ugc.aweme.ecommerce.dependency.legacy;

import X.C04TD;
import X.C14SG;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes31.dex */
public final class LegacyDependencyService implements ILegacyDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService
    public String getUserResidence() {
        return SharePrefCache.inst().getUserResidence().LIZ();
    }

    public static ILegacyDependencyService createILegacyDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILegacyDependencyService.class, z);
        if (objLIZ != null) {
            return (ILegacyDependencyService) objLIZ;
        }
        if (C04TD.y == null) {
            synchronized (ILegacyDependencyService.class) {
                if (C04TD.y == null) {
                    C04TD.y = new LegacyDependencyService();
                }
            }
        }
        return C04TD.y;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService
    public Aweme parseAwemeJSONStr(String str) {
        return (Aweme) new C14SG(Aweme.class).LIZ(str);
    }
}
