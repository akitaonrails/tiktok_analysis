package com.ss.android.ugc.aweme.pns.serviceimp;

import X.C01GW;
import X.C15Y8;
import X.C15Y9;
import X.C15Z0;
import X.C15Z3;
import X.C15Z8;
import X.C20539815Yu;
import X.C452501pT;
import X.InterfaceC2661011f;
import com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory;
import java.security.InvalidParameterException;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSProtectionDataLayerServiceFactory implements IPNSProtectionDataLayerServiceFactory {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(240));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(241));

    @Override // com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory
    public final C15Y8 LIZ() {
        return (C15Y8) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory
    public final C15Y9 LIZJ() {
        return (C15Y9) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory
    public final C20539815Yu LIZIZ(C15Z3 c15z3) {
        InterfaceC2661011f interfaceC2661011f = c15z3.LIZ;
        if (interfaceC2661011f != null) {
            C15Z8 c15z8 = c15z3.LIZIZ;
            if (c15z8 != null) {
                return new C20539815Yu(new C15Z0(interfaceC2661011f, c15z8));
            }
            throw new InvalidParameterException();
        }
        throw new InvalidParameterException();
    }
}
