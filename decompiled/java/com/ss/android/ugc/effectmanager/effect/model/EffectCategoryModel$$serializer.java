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
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel$$serializer;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class EffectCategoryModel$$serializer implements C13H1<EffectCategoryModel> {
    public static final EffectCategoryModel$$serializer INSTANCE;
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
        EffectCategoryModel$$serializer effectCategoryModel$$serializer = new EffectCategoryModel$$serializer();
        INSTANCE = effectCategoryModel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel", effectCategoryModel$$serializer, 10);
        c19983913Gz.LJIIJ(FollowStatusChangeMethod.PARAM_UID, true);
        c19983913Gz.LJIIJ("name", true);
        c19983913Gz.LJIIJ("key", true);
        c19983913Gz.LJIIJ("icon", true);
        c19983913Gz.LJIIJ("icon_selected", true);
        c19983913Gz.LJIIJ("effects", true);
        c19983913Gz.LJIIJ("tags", true);
        c19983913Gz.LJIIJ("tags_updated_at", true);
        c19983913Gz.LJIIJ("is_default", true);
        c19983913Gz.LJIIJ("extra", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = EffectCategoryModel.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        UrlModel$$serializer urlModel$$serializer = UrlModel$$serializer.INSTANCE;
        return new C13HG[]{c13gx, c13gx, c13gx, C19983613Gw.LIZ(urlModel$$serializer), C19983613Gw.LIZ(urlModel$$serializer), C19983613Gw.LIZ(c01gwArr[5].getValue()), C19983613Gw.LIZ(c01gwArr[6].getValue()), C19983613Gw.LIZ(c13gx), C13HO.LIZ, C19983613Gw.LIZ(c13gx)};
    }

    @Override // X.InterfaceC19984213Hc
    public final EffectCategoryModel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = EffectCategoryModel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        String str = null;
        String strLJIILL = null;
        String strLJIILL2 = null;
        String strLJIILL3 = null;
        UrlModel urlModel = null;
        UrlModel urlModel2 = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        int i = 0;
        boolean zLJFF = false;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new EffectCategoryModel(i, strLJIILL, strLJIILL2, strLJIILL3, urlModel, urlModel2, list, list2, str2, zLJFF, str, (C19989813Jg) null);
                case 0:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                    break;
                case 1:
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 1);
                    i |= 2;
                    break;
                case 2:
                    strLJIILL3 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 2);
                    i |= 4;
                    break;
                case 3:
                    urlModel = (UrlModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 3, UrlModel$$serializer.INSTANCE, urlModel);
                    i |= 8;
                    break;
                case 4:
                    urlModel2 = (UrlModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 4, UrlModel$$serializer.INSTANCE, urlModel2);
                    i |= 16;
                    break;
                case 5:
                    list = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 7, C13GX.LIZ, str2);
                    i |= 128;
                    break;
                case 8:
                    zLJFF = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 8);
                    i |= 256;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 9, C13GX.LIZ, str);
                    i |= 512;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, EffectCategoryModel effectCategoryModel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        EffectCategoryModel.write$Self(effectCategoryModel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
