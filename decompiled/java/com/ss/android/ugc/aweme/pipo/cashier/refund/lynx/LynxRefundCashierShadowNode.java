package com.ss.android.ugc.aweme.pipo.cashier.refund.lynx;

import X.C1299980jvw;
import X.C1722120uuo;
import X.EnumC1300260jwO;
import X.InterfaceC1300000jvy;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* JADX INFO: loaded from: classes27.dex */
public final class LynxRefundCashierShadowNode extends ShadowNode implements InterfaceC1300000jvy {
    public float LJIJJLI = C1722120uuo.LIZ(160);
    public float LJIL = C1722120uuo.LIZ(32);

    public LynxRefundCashierShadowNode() {
        LJII(this);
    }

    @Override // X.InterfaceC1300000jvy
    public final long LIZLLL(LayoutNode layoutNode, float f, EnumC1300260jwO enumC1300260jwO, float f2, EnumC1300260jwO enumC1300260jwO2) {
        return C1299980jvw.LIZ(f, this.LJIJJLI + this.LJIL);
    }
}
