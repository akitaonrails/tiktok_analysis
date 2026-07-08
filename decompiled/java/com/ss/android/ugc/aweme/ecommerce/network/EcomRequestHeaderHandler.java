package com.ss.android.ugc.aweme.ecommerce.network;

import X.C034X;
import X.C0XLG;
import X.C0XLO;
import X.C0XM9;
import X.C1499330p7T;
import X.C1507490pKd;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.EcomRequestHeaderConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomRequestHeaderHandler implements NetworkPartner.RequestHandler {
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        C0XLO c0xlo = c0xm9.LIZJ;
        new AwS567S0100000_23(c0xlo, 88);
        C034X.LIZIZ();
        C0XLG c0xlg = c0xm9.LIZLLL;
        EcomRequestHeaderConfig.EcomRequestHeaderConfigModel[] ecomRequestHeaderConfigModelArr = EcomRequestHeaderConfig.LIZ;
        String str = c0xlo.LIZLLL;
        String strLIZ = c0xlo.LJFF.LIZ();
        ArrayList<C1507490pKd> arrayList = new ArrayList();
        EcomRequestHeaderConfig.EcomRequestHeaderConfigModel ecomRequestHeaderConfigModel = (EcomRequestHeaderConfig.EcomRequestHeaderConfigModel) ((LinkedHashMap) EcomRequestHeaderConfig.LIZIZ).get(str);
        if (ecomRequestHeaderConfigModel != null) {
            EcomRequestHeaderConfig.LIZ(ecomRequestHeaderConfigModel, arrayList);
        }
        EcomRequestHeaderConfig.EcomRequestHeaderConfigModel ecomRequestHeaderConfigModel2 = (EcomRequestHeaderConfig.EcomRequestHeaderConfigModel) ((LinkedHashMap) EcomRequestHeaderConfig.LIZJ).get(strLIZ);
        if (ecomRequestHeaderConfigModel2 != null) {
            EcomRequestHeaderConfig.LIZ(ecomRequestHeaderConfigModel2, arrayList);
        }
        for (C1507490pKd c1507490pKd : arrayList) {
            try {
                c0xlg.LIZ(c1507490pKd.LIZ, c1507490pKd.LIZIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
