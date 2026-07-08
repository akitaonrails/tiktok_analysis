package com.ss.android.ugc.effectmanager.common.model;

import X.C01GW;
import X.C13GX;
import X.C13H1;
import X.C13H3;
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
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class UrlModel$$serializer implements C13H1<UrlModel> {
    public static final UrlModel$$serializer INSTANCE;
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
        UrlModel$$serializer urlModel$$serializer = new UrlModel$$serializer();
        INSTANCE = urlModel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.common.model.UrlModel", urlModel$$serializer, 5);
        c19983913Gz.LJIIJ("url_list", true);
        c19983913Gz.LJIIJ("url_prefix", true);
        c19983913Gz.LJIIJ("uri", true);
        c19983913Gz.LJIIJ("md5", true);
        c19983913Gz.LJIIJ("url_sub_type", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = UrlModel.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{C19983613Gw.LIZ(c01gwArr[0].getValue()), C19983613Gw.LIZ(c01gwArr[1].getValue()), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(C13HI.LIZ)};
    }

    @Override // X.InterfaceC19984213Hc
    public final UrlModel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = UrlModel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        List list = null;
        int i = 0;
        List list2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ != 2) {
                            if (iLJIJJ != 3) {
                                if (iLJIJJ == 4) {
                                    num = (Integer) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 4, C13HI.LIZ, num);
                                    i |= 16;
                                } else {
                                    throw new C13II(iLJIJJ);
                                }
                            } else {
                                str2 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 3, C13GX.LIZ, str2);
                                i |= 8;
                            }
                        } else {
                            str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, C13GX.LIZ, str);
                            i |= 4;
                        }
                    } else {
                        list2 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list2);
                        i |= 2;
                    }
                } else {
                    list = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 0, c01gwArr[0].getValue(), list);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new UrlModel(i, list, list2, str, str2, num, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, UrlModel urlModel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        UrlModel.write$Self(urlModel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
