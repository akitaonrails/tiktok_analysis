package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C12ES;
import X.C13IQ;
import X.C1537480q70;
import X.C1537830q7Z;
import X.C1537910q7h;
import X.C1D63;
import X.C1D6D;
import X.EnumC115000c8;
import X.InterfaceC1531560pxS;
import X.InterfaceC2250311D5x;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public final class ExactLynxPreWidthPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public final Set<C1D6D> lifecycleStages = Collections.singleton(C1D6D.ON_BEFORE_VIEW_CREATE);

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
    public Set<C1D6D> getLifecycleStages() {
        return this.lifecycleStages;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        C1537910q7h c1537910q7h;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        InterfaceC1531560pxS interfaceC1531560pxS = null;
        if (c1537480q70 != null) {
            interfaceC1531560pxS = c1537480q70.hybridParams;
        }
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(c1d63.LIZIZ), 1073741824));
            c1537910q7h.LJIIZILJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
