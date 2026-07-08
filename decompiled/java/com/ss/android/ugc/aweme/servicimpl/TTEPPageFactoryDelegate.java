package com.ss.android.ugc.aweme.servicimpl;

import X.C01GW;
import X.C04TD;
import X.C19A3;
import X.C452501pT;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.gamora.TTEPPageFactory;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class TTEPPageFactoryDelegate implements TTEPPageFactory {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(129));

    public static TTEPPageFactory LIZIZ() {
        Object objLIZ = C04TD.LIZ(TTEPPageFactory.class, false);
        if (objLIZ != null) {
            return (TTEPPageFactory) objLIZ;
        }
        if (C04TD.S4 == null) {
            synchronized (TTEPPageFactory.class) {
                if (C04TD.S4 == null) {
                    C04TD.S4 = new TTEPPageFactoryDelegate();
                }
            }
        }
        return C04TD.S4;
    }

    @Override // com.ss.android.ugc.gamora.TTEPPageFactory
    public final void LIZ(C19A3 c19a3) {
        TTEPPageFactory tTEPPageFactory;
        if (AVInitializerImpl.LIZIZ && (tTEPPageFactory = (TTEPPageFactory) this.LIZ.getValue()) != null) {
            tTEPPageFactory.LIZ(c19a3);
        }
    }
}
