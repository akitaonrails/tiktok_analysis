package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13GX;
import X.C13H1;
import X.C13H3;
import X.C13HB;
import X.C13HD;
import X.C13HG;
import X.C13II;
import X.C19983613Gw;
import X.C19983913Gz;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class PanelInfoModel$$serializer implements C13H1<PanelInfoModel> {
    public static final PanelInfoModel$$serializer INSTANCE;
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
        PanelInfoModel$$serializer panelInfoModel$$serializer = new PanelInfoModel$$serializer();
        INSTANCE = panelInfoModel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel", panelInfoModel$$serializer, 9);
        c19983913Gz.LJIIJ("version", true);
        c19983913Gz.LJIIJ("category_list", true);
        c19983913Gz.LJIIJ("category_effects", true);
        c19983913Gz.LJIIJ("panel", true);
        c19983913Gz.LJIIJ("front_effect_id", true);
        c19983913Gz.LJIIJ("rear_effect_id", true);
        c19983913Gz.LJIIJ("url_prefix", true);
        c19983913Gz.LJIIJ("extra", true);
        c19983913Gz.LJIIJ("logId", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = PanelInfoModel.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, c01gwArr[1].getValue(), C19983613Gw.LIZ(CategoryEffectModel$$serializer.INSTANCE), C19983613Gw.LIZ(EffectPanelModel$$serializer.INSTANCE), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), c01gwArr[6].getValue(), C19983613Gw.LIZ(PanelInfoModel$Extra$$serializer.INSTANCE), C19983613Gw.LIZ(c13gx)};
    }

    @Override // X.InterfaceC19984213Hc
    public final PanelInfoModel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = PanelInfoModel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        String str = null;
        String strLJIILL = null;
        List list = null;
        CategoryEffectModel categoryEffectModel = null;
        EffectPanelModel effectPanelModel = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        PanelInfoModel.Extra extra = null;
        int i = 0;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new PanelInfoModel(i, strLJIILL, list, categoryEffectModel, effectPanelModel, str2, str3, list2, extra, str, null);
                case 0:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    categoryEffectModel = (CategoryEffectModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, CategoryEffectModel$$serializer.INSTANCE, categoryEffectModel);
                    i |= 4;
                    break;
                case 3:
                    effectPanelModel = (EffectPanelModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 3, EffectPanelModel$$serializer.INSTANCE, effectPanelModel);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 4, C13GX.LIZ, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 5, C13GX.LIZ, str3);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    extra = (PanelInfoModel.Extra) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 7, PanelInfoModel$Extra$$serializer.INSTANCE, extra);
                    i |= 128;
                    break;
                case 8:
                    str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 8, C13GX.LIZ, str);
                    i |= 256;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, PanelInfoModel panelInfoModel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        PanelInfoModel.write$Self(panelInfoModel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
