package com.ss.android.ugc.aweme.minis.payment;

import X.C04TD;
import X.C2195521AwI;
import X.C2195531AwJ;
import X.C2197361AzG;
import X.C2197431AzN;
import X.C2197471AzR;
import android.content.Context;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisPaymentService implements IMinisPaymentService {
    public static IMinisPaymentService LIZJ() {
        Object objLIZ = C04TD.LIZ(IMinisPaymentService.class, false);
        if (objLIZ != null) {
            return (IMinisPaymentService) objLIZ;
        }
        if (C04TD.f113n2 == null) {
            synchronized (IMinisPaymentService.class) {
                if (C04TD.f113n2 == null) {
                    C04TD.f113n2 = new MinisPaymentService();
                }
            }
        }
        return C04TD.f113n2;
    }

    @Override // com.ss.android.ugc.aweme.minis.payment.IMinisPaymentService
    public final C2197431AzN LIZ(Context context, C2197361AzG c2197361AzG, C2195531AwJ c2195531AwJ) {
        return new C2197431AzN(context, c2197361AzG, c2195531AwJ);
    }

    @Override // com.ss.android.ugc.aweme.minis.payment.IMinisPaymentService
    public final C2197471AzR LIZIZ(Context context, C2197361AzG c2197361AzG, C2195521AwI c2195521AwI) {
        return new C2197471AzR(context, c2197361AzG, c2195521AwI);
    }
}
