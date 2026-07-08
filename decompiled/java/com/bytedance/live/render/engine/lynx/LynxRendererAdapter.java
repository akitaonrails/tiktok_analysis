package com.bytedance.live.render.engine.lynx;

import X.AbstractC1140160fmA;
import X.C1139800fla;
import X.C1141060fnc;
import X.C1141220fns;
import X.EnumC1138990fkH;
import X.InterfaceC1140400fmY;
import X.InterfaceC1141000fnW;
import X.InterfaceC1141380fo8;
import X.InterfaceC1141540foO;

/* JADX INFO: loaded from: classes18.dex */
public final class LynxRendererAdapter implements InterfaceC1141380fo8 {
    public final InterfaceC1141000fnW lynxContainerCreator;

    @Override // X.InterfaceC1141380fo8
    public boolean support() {
        return true;
    }

    public InterfaceC1141540foO getPerfService() {
        return new C1141220fns(this.lynxContainerCreator);
    }

    public EnumC1138990fkH getType() {
        return EnumC1138990fkH.LYNX;
    }

    public LynxRendererAdapter(InterfaceC1141000fnW interfaceC1141000fnW) {
        this.lynxContainerCreator = interfaceC1141000fnW;
    }

    @Override // X.InterfaceC1141380fo8
    public boolean canRender(AbstractC1140160fmA abstractC1140160fmA) {
        return abstractC1140160fmA instanceof C1139800fla;
    }

    @Override // X.InterfaceC1141380fo8
    public InterfaceC1140400fmY create(AbstractC1140160fmA abstractC1140160fmA) {
        if ((abstractC1140160fmA instanceof C1139800fla) && canRender(abstractC1140160fmA)) {
            return new C1141060fnc((C1139800fla) abstractC1140160fmA, this.lynxContainerCreator);
        }
        return null;
    }
}
