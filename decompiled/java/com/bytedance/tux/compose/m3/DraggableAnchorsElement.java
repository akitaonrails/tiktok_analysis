package com.bytedance.tux.compose.m3;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676370tj1;
import X.C1682380tsi;
import X.C1682900ttY;
import X.C594920NVa;
import X.EnumC1684030tvN;
import X.InterfaceC594940NVc;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class DraggableAnchorsElement<T> extends AbstractC1685820tyG<C1676370tj1<T>> {
    public final C594920NVa<T> LIZIZ;
    public final Function2<C1682900ttY, C1682380tsi, Pair<InterfaceC594940NVc<T>, T>> LIZJ;
    public final EnumC1684030tvN LIZLLL;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676370tj1(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1676370tj1 c1676370tj1 = (C1676370tj1) abstractC20055413dY;
        c1676370tj1.LLJJ = this.LIZIZ;
        c1676370tj1.LLJJI = this.LIZJ;
        c1676370tj1.LLJJIII = this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, draggableAnchorsElement.LIZIZ) && this.LIZJ == draggableAnchorsElement.LIZJ && this.LIZLLL == draggableAnchorsElement.LIZLLL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(C594920NVa<T> c594920NVa, Function2<? super C1682900ttY, ? super C1682380tsi, ? extends Pair<? extends InterfaceC594940NVc<T>, ? extends T>> function2, EnumC1684030tvN enumC1684030tvN) {
        this.LIZIZ = c594920NVa;
        this.LIZJ = function2;
        this.LIZLLL = enumC1684030tvN;
    }
}
