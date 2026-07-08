package com.ss.android.ugc.aweme.relation.service;

import X.C04TD;
import X.C1E7H;
import X.C1E7I;
import X.C1E7K;
import X.C1E7L;
import com.ss.android.ugc.aweme.offline.relation.debug.IRelationDebugService;
import com.ss.android.ugc.aweme.relation.auth.experiment.FrequencyConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class SocialMonoFreqControlService implements ISocialMonoFreqControlService {
    public static ISocialMonoFreqControlService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ISocialMonoFreqControlService.class, false);
        if (objLIZ != null) {
            return (ISocialMonoFreqControlService) objLIZ;
        }
        if (C04TD.C3 == null) {
            synchronized (ISocialMonoFreqControlService.class) {
                if (C04TD.C3 == null) {
                    C04TD.C3 = new SocialMonoFreqControlService();
                }
            }
        }
        return C04TD.C3;
    }

    @Override // com.ss.android.ugc.aweme.relation.service.ISocialMonoFreqControlService
    public final boolean LIZ(C1E7L c1e7l) {
        int i = C1E7K.LIZ[c1e7l.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                return ((FrequencyConfig) C1E7I.LIZIZ.getValue()).enableRecUser;
            }
            ((IRelationDebugService) C1E7H.LIZ.getValue()).LIZ();
            return ((FrequencyConfig) C1E7I.LIZIZ.getValue()).enableContact;
        }
        ((IRelationDebugService) C1E7H.LIZ.getValue()).LIZIZ();
        if (C1E7I.LIZ()) {
            return true;
        }
        return false;
    }
}
