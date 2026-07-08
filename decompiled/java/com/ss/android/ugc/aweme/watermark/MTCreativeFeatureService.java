package com.ss.android.ugc.aweme.watermark;

import X.C04TD;
import com.ss.android.ugc.aweme.ICCreativeFeatureService;

/* JADX INFO: loaded from: classes3.dex */
public final class MTCreativeFeatureService implements ICCreativeFeatureService {
    @Override // com.ss.android.ugc.aweme.ICCreativeFeatureService
    public final void LIZ() {
    }

    public static ICCreativeFeatureService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ICCreativeFeatureService.class, false);
        if (objLIZ != null) {
            return (ICCreativeFeatureService) objLIZ;
        }
        if (C04TD.a6 == null) {
            synchronized (ICCreativeFeatureService.class) {
                if (C04TD.a6 == null) {
                    C04TD.a6 = new MTCreativeFeatureService();
                }
            }
        }
        return C04TD.a6;
    }
}
