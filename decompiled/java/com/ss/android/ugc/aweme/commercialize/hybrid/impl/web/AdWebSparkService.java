package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web;

import X.C04TD;
import X.C1035880d3y;
import X.C1036770d5P;
import X.C1039440d9i;
import X.InterfaceC1029720cu2;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebSparkService;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebSparkService implements IAdWebSparkService {
    public static IAdWebSparkService LIZJ() {
        Object objLIZ = C04TD.LIZ(IAdWebSparkService.class, false);
        if (objLIZ != null) {
            return (IAdWebSparkService) objLIZ;
        }
        if (C04TD.LLLII == null) {
            synchronized (IAdWebSparkService.class) {
                if (C04TD.LLLII == null) {
                    C04TD.LLLII = new AdWebSparkService();
                }
            }
        }
        return C04TD.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebSparkService
    public final AdWebSparkFragment LIZIZ() {
        return new AdWebSparkFragment();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebSparkService
    public final AdWebSparkFragment LIZ(Context context, String str, String str2, Bundle bundle, C1035880d3y c1035880d3y, C1039440d9i c1039440d9i, InterfaceC1029720cu2 interfaceC1029720cu2, InterfaceC1029720cu2 interfaceC1029720cu22) {
        C1036770d5P.LIZ.getClass();
        return C1036770d5P.LIZIZ(false, context, str, bundle, c1035880d3y, c1039440d9i, interfaceC1029720cu2, interfaceC1029720cu22);
    }
}
