package com.ss.android.ugc.aweme.framework.analysis;

import X.C04TD;
import X.C2344809Gs;
import com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService;

/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsWrapperService implements ICrashlyticsWrapperService {
    public static ICrashlyticsWrapperService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ICrashlyticsWrapperService.class, false);
        if (objLIZ != null) {
            return (ICrashlyticsWrapperService) objLIZ;
        }
        if (C04TD.F0 == null) {
            synchronized (ICrashlyticsWrapperService.class) {
                if (C04TD.F0 == null) {
                    C04TD.F0 = new CrashlyticsWrapperService();
                }
            }
        }
        return C04TD.F0;
    }

    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
    public final void LIZJ(Exception exc) {
        C2344809Gs.LIZ(exc);
    }

    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
    public final void log(String str) {
        C2344809Gs.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
    public final void logException(Throwable th) {
        C2344809Gs.LJI(th);
    }

    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
    public final void LIZIZ(String str, Exception exc) throws Exception {
        C2344809Gs.LIZIZ(str, exc);
    }

    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
    public final void log(String str, String str2) {
        C2344809Gs.LJFF(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
    public final void LIZ(int i, String str, String str2) {
        C2344809Gs.LIZLLL(i, str, str2);
    }
}
