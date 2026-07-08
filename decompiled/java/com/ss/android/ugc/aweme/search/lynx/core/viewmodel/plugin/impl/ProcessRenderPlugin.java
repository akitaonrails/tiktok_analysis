package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C13LQ;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1D61;
import X.C1D63;
import X.C1D6C;
import X.EnumC115000c8;
import X.EnumC1905430zgT;
import X.InterfaceC1541990qEH;
import X.InterfaceC2250311D5x;
import com.lynx.tasm.LynxView;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public final class ProcessRenderPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public boolean isRun;
    public final Set<C13IQ<? extends InterfaceC2250311D5x>> dependencies = C08CX.INSTANCE;
    public final Set<C1D61> lifecycleStages = C13LQ.LJLIIL(new C1D61[]{C1D6C.ON_LOAD_FINISH, EnumC1905430zgT.LAYOUT_FINISH});

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
    }

    @Override // X.InterfaceC2250311D5x
    public int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return this.dependencies;
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
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        LynxView lynxView = null;
        if (c1537480q70 != null) {
            interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        if (interfaceC1541990qEHLJIJJ instanceof C1537720q7O) {
            lynxView = (LynxView) interfaceC1541990qEHLJIJJ;
        }
        if (this.isRun) {
            return C1156460gCS.LIZ;
        }
        if (lynxView != null) {
            lynxView.processRender();
            lynxView.syncFlush();
        }
        this.isRun = true;
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
