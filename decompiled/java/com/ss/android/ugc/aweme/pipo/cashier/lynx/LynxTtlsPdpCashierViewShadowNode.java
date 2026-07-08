package com.ss.android.ugc.aweme.pipo.cashier.lynx;

import X.C1299980jvw;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1710050ubL;
import X.C2188811AlT;
import X.EnumC1300260jwO;
import X.InterfaceC1300000jvy;
import android.view.View;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* JADX INFO: loaded from: classes27.dex */
public final class LynxTtlsPdpCashierViewShadowNode extends ShadowNode implements InterfaceC1300000jvy {
    public C1710050ubL LJIJJLI;
    public int LJIL;
    public float LJJ;

    public LynxTtlsPdpCashierViewShadowNode() {
        LJII(this);
    }

    public static void LJJIII(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttls_pdp_cashier_view_shadow_node, ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1300000jvy
    public final long LIZLLL(LayoutNode layoutNode, float f, EnumC1300260jwO enumC1300260jwO, float f2, EnumC1300260jwO enumC1300260jwO2) {
        this.LJJ = f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(f);
        sbLIZ.append(", ");
        sbLIZ.append(enumC1300260jwO);
        sbLIZ.append(", ");
        sbLIZ.append(f2);
        sbLIZ.append(", ");
        sbLIZ.append(enumC1300260jwO2);
        sbLIZ.append(", cashier_view: ");
        sbLIZ.append(this.LJIJJLI);
        LJJIII(C2188811AlT.LIZIZ(sbLIZ));
        C1710050ubL c1710050ubL = this.LJIJJLI;
        if (c1710050ubL != null) {
            c1710050ubL.measure(View.MeasureSpec.makeMeasureSpec((int) this.LJJ, 1073741824), View.MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE, Integer.MIN_VALUE));
            this.LJIL = c1710050ubL.getMeasuredHeight();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("new H: ");
        sbLIZ2.append(this.LJIL);
        LJJIII(C2188811AlT.LIZIZ(sbLIZ2));
        return C1299980jvw.LIZ(f, this.LJIL);
    }
}
