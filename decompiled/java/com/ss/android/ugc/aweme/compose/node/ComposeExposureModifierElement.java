package com.ss.android.ugc.aweme.compose.node;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1776880wL8;
import X.C20088313ir;
import X.C20088513it;
import X.C20088713iv;
import X.C2188811AlT;
import X.C258120A9q;
import X.InterfaceC20089713j5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ComposeExposureModifierElement extends AbstractC1685820tyG<C20088513it> {
    public final C1776880wL8 LIZIZ;
    public final InterfaceC20089713j5 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeExposureModifierElement)) {
            return false;
        }
        ComposeExposureModifierElement composeExposureModifierElement = (ComposeExposureModifierElement) obj;
        return Intrinsics.LJFF(this.LIZIZ, composeExposureModifierElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, composeExposureModifierElement.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposeExposureModifierElement(config=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exposureCallback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20088513it(this.LIZIZ, this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C20088313ir c20088313ir;
        C20088513it c20088513it = (C20088513it) abstractC20055413dY;
        C1776880wL8 c1776880wL8 = this.LIZIZ;
        InterfaceC20089713j5 interfaceC20089713j5 = this.LIZJ;
        c20088513it.getClass();
        if (C258120A9q.LIZ()) {
            c20088513it.LLJJ = c1776880wL8;
            c20088513it.LLJJI = interfaceC20089713j5;
            C20088713iv c20088713iv = c20088513it.LLJJIII;
            if (!Intrinsics.LJFF(c20088713iv.LIZ.LIZ, c1776880wL8.LIZ)) {
                c20088713iv.LIZ("updateNodeData");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateNodeData itemId: ");
                sbLIZ.append(c20088713iv.LIZ.LIZ);
                sbLIZ.append(" -> ");
                sbLIZ.append(c1776880wL8.LIZ);
                sbLIZ.append("  dataChangeExposure: ");
                sbLIZ.append(c20088713iv.LIZ.LJFF);
                C2188811AlT.LIZIZ(sbLIZ);
                C1776880wL8 c1776880wL82 = c20088713iv.LIZ;
                c1776880wL82.LIZ = c1776880wL8.LIZ;
                c20088713iv.LIZIZ = interfaceC20089713j5;
                if (c1776880wL82.LJFF && (c20088313ir = c20088713iv.LIZLLL) != null) {
                    c20088313ir.LJFF();
                }
            }
        }
    }

    public ComposeExposureModifierElement(C1776880wL8 c1776880wL8, InterfaceC20089713j5 interfaceC20089713j5) {
        this.LIZIZ = c1776880wL8;
        this.LIZJ = interfaceC20089713j5;
    }
}
