package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13H1;
import X.C13H3;
import X.C13HB;
import X.C13HD;
import X.C13HG;
import X.C13II;
import X.C19983913Gz;
import X.C19989813Jg;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class EffectLabel$$serializer implements C13H1<EffectLabel> {
    public static final EffectLabel$$serializer INSTANCE;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public /* bridge */ /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        EffectLabel$$serializer effectLabel$$serializer = new EffectLabel$$serializer();
        INSTANCE = effectLabel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.EffectLabel", effectLabel$$serializer, 3);
        c19983913Gz.LJIIJ("label_one", true);
        c19983913Gz.LJIIJ("label_two", true);
        c19983913Gz.LJIIJ("label_platform", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = EffectLabel.$childSerializers;
        return new C13HG[]{c01gwArr[0].getValue(), c01gwArr[1].getValue(), c01gwArr[2].getValue()};
    }

    @Override // X.InterfaceC19984213Hc
    public final EffectLabel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = EffectLabel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        List list = null;
        int i = 0;
        List list2 = null;
        List list3 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ == 2) {
                            list3 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 2, c01gwArr[2].getValue(), list3);
                            i |= 4;
                        } else {
                            throw new C13II(iLJIJJ);
                        }
                    } else {
                        list2 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list2);
                        i |= 2;
                    }
                } else {
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 0, c01gwArr[0].getValue(), list);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new EffectLabel(i, list, list2, list3, (C19989813Jg) null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, EffectLabel effectLabel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        EffectLabel.write$Self$ckresource_model_release(effectLabel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
