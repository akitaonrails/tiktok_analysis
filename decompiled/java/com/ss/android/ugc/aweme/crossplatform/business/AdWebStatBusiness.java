package com.ss.android.ugc.aweme.crossplatform.business;

import X.C1041550dD7;
import X.C1041660dDI;
import X.C1043250dFr;
import X.C1388190mED;
import X.C1968907nT;
import X.InterfaceC1037450d6V;
import X.InterfaceC1038710d8X;
import android.app.Activity;
import android.webkit.WebBackForwardList;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.log.AdWebLogService;

/* JADX INFO: loaded from: classes17.dex */
public class AdWebStatBusiness extends BusinessService.Business {
    public final InterfaceC1038710d8X LIZLLL;

    public final boolean LIZ() {
        C1041550dD7 c1041550dD7;
        C1041660dDI c1041660dDI = this.LIZIZ;
        return (c1041660dDI == null || (c1041550dD7 = c1041660dDI.LIZIZ) == null || c1041550dD7.LL <= 0) ? false : true;
    }

    public AdWebStatBusiness(C1968907nT c1968907nT) {
        super(c1968907nT);
        new C1043250dFr();
        this.LIZLLL = AdWebLogService.LJIIIZ().LIZ();
    }

    public final void LIZIZ(boolean z, WebBackForwardList webBackForwardList, InterfaceC1037450d6V interfaceC1037450d6V, String str) {
        Activity activityLIZ = C1388190mED.LIZ(this.LIZ.getContext());
        if (activityLIZ != null && LIZ()) {
            if (!z) {
                InterfaceC1038710d8X interfaceC1038710d8X = this.LIZLLL;
                if (interfaceC1038710d8X != null) {
                    interfaceC1038710d8X.LIZIZ();
                }
                if (!activityLIZ.isFinishing()) {
                    return;
                }
            }
            InterfaceC1038710d8X interfaceC1038710d8X2 = this.LIZLLL;
            if (interfaceC1038710d8X2 != null) {
                interfaceC1038710d8X2.LJJJLIIL();
            }
        }
    }
}
