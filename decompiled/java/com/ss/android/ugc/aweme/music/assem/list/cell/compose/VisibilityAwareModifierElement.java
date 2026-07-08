package com.ss.android.ugc.aweme.music.assem.list.cell.compose;

import X.AbstractC1685820tyG;
import X.AbstractC1686410tzD;
import X.AbstractC20055413dY;
import X.C1686400tzC;
import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VisibilityAwareModifierElement extends AbstractC1685820tyG<C1686400tzC> {
    public final Function1<AbstractC1686410tzD, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VisibilityAwareModifierElement) && Intrinsics.LJFF(this.LIZIZ, ((VisibilityAwareModifierElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisibilityAwareModifierElement(visibleEventCallback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1686400tzC(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VisibilityAwareModifierElement(Function1<? super AbstractC1686410tzD, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1686400tzC) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
