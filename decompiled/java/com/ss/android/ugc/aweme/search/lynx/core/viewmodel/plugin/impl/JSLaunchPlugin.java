package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1D61;
import X.C1D63;
import X.C1D6D;
import X.EnumC115000c8;
import X.InterfaceC2250311D5x;
import com.lynx.tasm.LynxView;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public final class JSLaunchPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public final int priority = 999;
    public final Set<C1D61> lifecycleStages = Collections.singleton(C1D6D.ON_DATA_UPDATED);

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
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
    public int getPriority() {
        return this.priority;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        LynxView lynxView;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        Object objLJIJJ = null;
        if (c1537480q70 != null) {
            objLJIJJ = c1537480q70.LJIJJ();
        }
        if ((objLJIJJ instanceof C1537720q7O) && (lynxView = (LynxView) objLJIJJ) != null) {
            lynxView.startLynxRuntime();
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
