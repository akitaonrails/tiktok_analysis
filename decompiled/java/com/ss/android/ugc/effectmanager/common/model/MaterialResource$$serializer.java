package com.ss.android.ugc.effectmanager.common.model;

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
import X.C19983613Gw;
import X.C19983913Gz;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class MaterialResource$$serializer implements C13H1<MaterialResource> {
    public static final MaterialResource$$serializer INSTANCE;
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
        MaterialResource$$serializer materialResource$$serializer = new MaterialResource$$serializer();
        INSTANCE = materialResource$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.common.model.MaterialResource", materialResource$$serializer, 9);
        c19983913Gz.LJIIJ("resource_key", true);
        c19983913Gz.LJIIJ("CDNList", true);
        c19983913Gz.LJIIJ("uri", true);
        c19983913Gz.LJIIJ("BaseInfo", true);
        c19983913Gz.LJIIJ("version", true);
        c19983913Gz.LJIIJ("type", true);
        c19983913Gz.LJIIJ("isAssetMaterial", true);
        c19983913Gz.LJIIJ("skipVerifyMd5", true);
        c19983913Gz.LJIIJ("assetType", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = MaterialResource.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        C13HI c13hi = C13HI.LIZ;
        C13HO c13ho = C13HO.LIZ;
        return new C13HG[]{c13gx, c01gwArr[1].getValue(), c13gx, C19983613Gw.LIZ(BaseInfo$$serializer.INSTANCE), c13hi, c13gx, c13ho, c13ho, C19983613Gw.LIZ(c13hi)};
    }

    @Override // X.InterfaceC19984213Hc
    public final MaterialResource deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = MaterialResource.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        Integer num = null;
        String strLJIILL = null;
        List list = null;
        String strLJIILL2 = null;
        BaseInfo baseInfo = null;
        String strLJIILL3 = null;
        int i = 0;
        int iLJIJJLI = 0;
        boolean zLJFF = false;
        boolean zLJFF2 = false;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new MaterialResource(i, strLJIILL, list, strLJIILL2, baseInfo, iLJIJJLI, strLJIILL3, zLJFF, zLJFF2, num, null);
                case 0:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 2);
                    i |= 4;
                    break;
                case 3:
                    baseInfo = (BaseInfo) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 3, BaseInfo$$serializer.INSTANCE, baseInfo);
                    i |= 8;
                    break;
                case 4:
                    iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 4);
                    i |= 16;
                    break;
                case 5:
                    strLJIILL3 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 5);
                    i |= 32;
                    break;
                case 6:
                    zLJFF = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 6);
                    i |= 64;
                    break;
                case 7:
                    zLJFF2 = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 7);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 8, C13HI.LIZ, num);
                    i |= 256;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, MaterialResource materialResource) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        MaterialResource.write$Self$ckresource_model_release(materialResource, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
