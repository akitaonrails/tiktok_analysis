package com.ss.android.ugc.effectmanager.common.model;

import X.C13GX;
import X.C13H1;
import X.C13H3;
import X.C13H6;
import X.C13HB;
import X.C13HD;
import X.C13HG;
import X.C13HI;
import X.C13II;
import X.C19983613Gw;
import X.C19983913Gz;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class BaseInfo$$serializer implements C13H1<BaseInfo> {
    public static final BaseInfo$$serializer INSTANCE;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13H6 c13h6 = C13H6.LIZ;
        C13HI c13hi = C13HI.LIZ;
        return new C13HG[]{C13GX.LIZ, c13h6, C19983613Gw.LIZ(c13hi), C19983613Gw.LIZ(c13hi), C19983613Gw.LIZ(c13h6)};
    }

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public /* bridge */ /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        BaseInfo$$serializer baseInfo$$serializer = new BaseInfo$$serializer();
        INSTANCE = baseInfo$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.common.model.BaseInfo", baseInfo$$serializer, 5);
        c19983913Gz.LJIIJ("ext", true);
        c19983913Gz.LJIIJ("size", true);
        c19983913Gz.LJIIJ("height", true);
        c19983913Gz.LJIIJ("width", true);
        c19983913Gz.LJIIJ("duration", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final BaseInfo deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        long jLJIIIIZZ = 0;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ != 2) {
                            if (iLJIJJ != 3) {
                                if (iLJIJJ == 4) {
                                    l = (Long) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 4, C13H6.LIZ, l);
                                    i |= 16;
                                } else {
                                    throw new C13II(iLJIJJ);
                                }
                            } else {
                                num2 = (Integer) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 3, C13HI.LIZ, num2);
                                i |= 8;
                            }
                        } else {
                            num = (Integer) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, C13HI.LIZ, num);
                            i |= 4;
                        }
                    } else {
                        jLJIIIIZZ = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 1);
                        i |= 2;
                    }
                } else {
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new BaseInfo(i, strLJIILL, jLJIIIIZZ, num, num2, l, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, BaseInfo baseInfo) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        BaseInfo.write$Self$ckresource_model_release(baseInfo, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
