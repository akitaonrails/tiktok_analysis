package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156430gCP;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C1537480q70;
import X.C1D63;
import X.C1D6D;
import X.C650240Pew;
import X.C786410Ut5;
import X.EnumC115000c8;
import X.InterfaceC1541990qEH;
import X.InterfaceC2250311D5x;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public final class ExactLynxHeightPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public final int priority = 1;
    public final Set<C1D6D> lifecycleStages = Collections.singleton(C1D6D.ON_VIEW_CREATE);

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
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
    public int getPriority() {
        return this.priority;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        View viewE1;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        if (c1537480q70 != null && (interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ()) != null && (viewE1 = interfaceC1541990qEHLJIJJ.e1()) != null) {
            C650240Pew c650240Pew = C650240Pew.LIZ;
            Context context = viewE1.getContext();
            c650240Pew.getClass();
            C786410Ut5.W5(viewE1, new ViewGroup.LayoutParams(-1, C650240Pew.LIZIZ(context)));
            return new C1156440gCQ(EnumC115000c8.SUCCESS);
        }
        return new C1156430gCP(new Error("set lynx height failure: real view is null"));
    }
}
