package com.bytedance.lynx.hybrid.bridge;

import X.C1299050juR;
import X.C1543320qGQ;
import X.C1543910qHN;
import X.EnumC993810by7;
import X.InterfaceC1543070qG1;
import X.InterfaceC1543360qGU;
import X.InterfaceC1543370qGV;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultHybridBridgeImpl implements IBridgeServiceApi {
    @Override // com.bytedance.lynx.hybrid.bridge.IBridgeServiceApi
    public void onDownGrade(InterfaceC1543070qG1 interfaceC1543070qG1, C1543910qHN c1543910qHN, InterfaceC1543370qGV interfaceC1543370qGV) {
        InterfaceC1543360qGU interfaceC1543360qGULIZJ;
        if (c1543910qHN.LJIIJ.length() > 0 && (interfaceC1543360qGULIZJ = interfaceC1543070qG1.LIZJ(c1543910qHN)) != null) {
            C1299050juR c1299050juR = InterfaceC1543360qGU.LIZ;
            Object obj = c1543910qHN.LJIIIIZZ;
            c1299050juR.getClass();
            if (interfaceC1543360qGULIZJ.LIZIZ(c1543910qHN, C1299050juR.LIZ(obj), interfaceC1543370qGV)) {
                return;
            }
        }
        C1543320qGQ c1543320qGQLIZIZ = interfaceC1543070qG1.LIZIZ();
        C1299050juR c1299050juR2 = InterfaceC1543360qGU.LIZ;
        Object obj2 = c1543910qHN.LJIIIIZZ;
        c1299050juR2.getClass();
        if (!c1543320qGQLIZIZ.LIZIZ(c1543910qHN, C1299050juR.LIZ(obj2), interfaceC1543370qGV)) {
            interfaceC1543370qGV.LIZJ(EnumC993810by7.NOT_FOUND);
        }
    }
}
