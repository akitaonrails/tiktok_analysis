package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13GX;
import X.C13H1;
import X.C13H3;
import X.C13HB;
import X.C13HD;
import X.C13HG;
import X.C13HI;
import X.C13HO;
import X.C13II;
import X.C19983913Gz;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class CategoryEffectModel$$serializer implements C13H1<CategoryEffectModel> {
    public static final CategoryEffectModel$$serializer INSTANCE;
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
        CategoryEffectModel$$serializer categoryEffectModel$$serializer = new CategoryEffectModel$$serializer();
        INSTANCE = categoryEffectModel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel", categoryEffectModel$$serializer, 10);
        c19983913Gz.LJIIJ("category_key", true);
        c19983913Gz.LJIIJ("version", true);
        c19983913Gz.LJIIJ("has_more", true);
        c19983913Gz.LJIIJ("cursor", true);
        c19983913Gz.LJIIJ("sorting_position", true);
        c19983913Gz.LJIIJ("collection", true);
        c19983913Gz.LJIIJ("effects", true);
        c19983913Gz.LJIIJ("bind_effects", true);
        c19983913Gz.LJIIJ("creation_mode_count", true);
        c19983913Gz.LJIIJ("isCache", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = CategoryEffectModel.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        C13HO c13ho = C13HO.LIZ;
        C13HI c13hi = C13HI.LIZ;
        return new C13HG[]{c13gx, c13gx, c13ho, c13hi, c13hi, c01gwArr[5].getValue(), c01gwArr[6].getValue(), c01gwArr[7].getValue(), c13hi, c13ho};
    }

    @Override // X.InterfaceC19984213Hc
    public final CategoryEffectModel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = CategoryEffectModel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        String strLJIILL2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        boolean zLJFF = false;
        int iLJIJJLI = 0;
        int iLJIJJLI2 = 0;
        int iLJIJJLI3 = 0;
        boolean zLJFF2 = false;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new CategoryEffectModel(i, strLJIILL, strLJIILL2, zLJFF, iLJIJJLI, iLJIJJLI2, list, list2, list3, iLJIJJLI3, zLJFF2, null);
                case 0:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                    break;
                case 1:
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 1);
                    i |= 2;
                    break;
                case 2:
                    zLJFF = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 2);
                    i |= 4;
                    break;
                case 3:
                    iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 3);
                    i |= 8;
                    break;
                case 4:
                    iLJIJJLI2 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    list3 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 7, c01gwArr[7].getValue(), list3);
                    i |= 128;
                    break;
                case 8:
                    iLJIJJLI3 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 8);
                    i |= 256;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    zLJFF2 = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 9);
                    i |= 512;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, CategoryEffectModel categoryEffectModel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        CategoryEffectModel.write$Self(categoryEffectModel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
