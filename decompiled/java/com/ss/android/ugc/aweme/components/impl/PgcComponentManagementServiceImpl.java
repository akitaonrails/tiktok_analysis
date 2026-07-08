package com.ss.android.ugc.aweme.components.impl;

import X.C13ZC;
import X.C1674030tfF;
import X.C1674060tfI;
import X.C1674070tfJ;
import X.C20030013Ys;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.components.model.ComponentKey;
import com.ss.android.ugc.aweme.service.IPgcComponentManagementService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS124S0201000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class PgcComponentManagementServiceImpl implements IPgcComponentManagementService {
    public final Map<ComponentKey, C1674060tfI> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.service.IPgcComponentManagementService
    public final void LIZ(C1674030tfF c1674030tfF, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        InterfaceC1631620sYq<C1674030tfF, InterfaceC1680500tpg, Integer, Unit> interfaceC1631620sYq;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-914908592);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1674030tfF)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (this.LIZ.isEmpty()) {
                this.LIZ.put(ComponentKey.BRIEF_INFO, new C1674060tfI(C1674070tfJ.LIZ));
                this.LIZ.put(ComponentKey.INFO_SECTION, new C1674060tfI(C1674070tfJ.LIZIZ));
                this.LIZ.put(ComponentKey.PURCHASE_OPTIONS, new C1674060tfI(C1674070tfJ.LIZJ));
                this.LIZ.put(ComponentKey.PURCHASE_BUTTON, new C1674060tfI(C1674070tfJ.LIZLLL));
            }
            C1674060tfI c1674060tfI = (C1674060tfI) ((LinkedHashMap) this.LIZ).get(c1674030tfF.LIZ);
            if (c1674060tfI != null && (interfaceC1631620sYq = c1674060tfI.LIZ) != null) {
                interfaceC1631620sYq.invoke(c1674030tfF, c13zcLJIIJ, Integer.valueOf(i2 & 14));
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1674030tfF, i, 25);
        }
    }
}
