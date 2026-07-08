package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1D3S;
import X.C1D61;
import X.C1D63;
import X.C1D6C;
import X.C2188811AlT;
import X.C649470Pdh;
import X.EnumC115000c8;
import X.InterfaceC1541990qEH;
import X.InterfaceC2250311D5x;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public final class DebugTagPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public final Set<C1D61> lifecycleStages = Collections.singleton(C1D6C.ON_LOAD_FINISH);

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
    }

    @Override // X.InterfaceC2250311D5x
    public int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C1D61> getLifecycleStages() {
        return this.lifecycleStages;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1537720q7O c1537720q7O;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        Object objLJFF = null;
        if (c1537480q70 != null) {
            interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        if (interfaceC1541990qEHLJIJJ instanceof C1537720q7O) {
            c1537720q7O = (C1537720q7O) interfaceC1541990qEHLJIJJ;
        } else {
            c1537720q7O = null;
        }
        C1537480q70 c1537480q702 = c1d63.LIZJ;
        if (c1537480q702 != null) {
            objLJFF = c1537480q702.LJFF(C1D3S.class);
        }
        if (objLJFF == C1D3S.PRE_LAYOUT) {
            C649470Pdh c649470Pdh = C649470Pdh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("newArch");
            sbLIZ.append("-preLayout");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c649470Pdh.getClass();
            C649470Pdh.LJJIIJZLJL(c1537720q7O, strLIZIZ);
        } else {
            C649470Pdh.LIZ.getClass();
            C649470Pdh.LJJIIJZLJL(c1537720q7O, "newArch");
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
