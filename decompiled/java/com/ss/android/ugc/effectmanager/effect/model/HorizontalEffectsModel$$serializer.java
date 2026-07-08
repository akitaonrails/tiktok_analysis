package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13GX;
import X.C13H1;
import X.C13H3;
import X.C13HB;
import X.C13HD;
import X.C13HG;
import X.C13HO;
import X.C13II;
import X.C19983613Gw;
import X.C19983913Gz;
import X.C19989813Jg;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class HorizontalEffectsModel$$serializer implements C13H1<HorizontalEffectsModel> {
    public static final HorizontalEffectsModel$$serializer INSTANCE;
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
        HorizontalEffectsModel$$serializer horizontalEffectsModel$$serializer = new HorizontalEffectsModel$$serializer();
        INSTANCE = horizontalEffectsModel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel", horizontalEffectsModel$$serializer, 8);
        c19983913Gz.LJIIJ("trending_effects", true);
        c19983913Gz.LJIIJ("favorite_effects", true);
        c19983913Gz.LJIIJ("recent_effects", true);
        c19983913Gz.LJIIJ("insert_effects", true);
        c19983913Gz.LJIIJ("left_trending_effects", true);
        c19983913Gz.LJIIJ("url_prefix", true);
        c19983913Gz.LJIIJ("from_cache", true);
        c19983913Gz.LJIIJ("logId", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = HorizontalEffectsModel.$childSerializers;
        return new C13HG[]{c01gwArr[0].getValue(), C19983613Gw.LIZ(c01gwArr[1].getValue()), C19983613Gw.LIZ(c01gwArr[2].getValue()), C19983613Gw.LIZ(c01gwArr[3].getValue()), C19983613Gw.LIZ(c01gwArr[4].getValue()), c01gwArr[5].getValue(), C13HO.LIZ, C19983613Gw.LIZ(C13GX.LIZ)};
    }

    @Override // X.InterfaceC19984213Hc
    public final HorizontalEffectsModel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = HorizontalEffectsModel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        String str = null;
        int i = 0;
        boolean zLJFF = false;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new HorizontalEffectsModel(i, list, list2, list3, list4, list5, list6, zLJFF, str, (C19989813Jg) null);
                case 0:
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 0, c01gwArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, c01gwArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    list4 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 3, c01gwArr[3].getValue(), list4);
                    i |= 8;
                    break;
                case 4:
                    list5 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 4, c01gwArr[4].getValue(), list5);
                    i |= 16;
                    break;
                case 5:
                    list6 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), list6);
                    i |= 32;
                    break;
                case 6:
                    zLJFF = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 7, C13GX.LIZ, str);
                    i |= 128;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, HorizontalEffectsModel horizontalEffectsModel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        HorizontalEffectsModel.write$Self$ckresource_model_release(horizontalEffectsModel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
