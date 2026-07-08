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
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel$$serializer;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class EffectPanelModel$$serializer implements C13H1<EffectPanelModel> {
    public static final EffectPanelModel$$serializer INSTANCE;
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
        EffectPanelModel$$serializer effectPanelModel$$serializer = new EffectPanelModel$$serializer();
        INSTANCE = effectPanelModel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel", effectPanelModel$$serializer, 6);
        c19983913Gz.LJIIJ("text", true);
        c19983913Gz.LJIIJ(FollowStatusChangeMethod.PARAM_UID, true);
        c19983913Gz.LJIIJ("icon", true);
        c19983913Gz.LJIIJ("tags", true);
        c19983913Gz.LJIIJ("tags_updated_at", true);
        c19983913Gz.LJIIJ("extra", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = EffectPanelModel.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(UrlModel$$serializer.INSTANCE), c01gwArr[3].getValue(), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx)};
    }

    @Override // X.InterfaceC19984213Hc
    public final EffectPanelModel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = EffectPanelModel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        String str = null;
        int i = 0;
        String str2 = null;
        UrlModel urlModel = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new EffectPanelModel(i, str, str2, urlModel, list, str3, str4, null);
                case 0:
                    str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 0, C13GX.LIZ, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, C13GX.LIZ, str2);
                    i |= 2;
                    break;
                case 2:
                    urlModel = (UrlModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, UrlModel$$serializer.INSTANCE, urlModel);
                    i |= 4;
                    break;
                case 3:
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 3, c01gwArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 4, C13GX.LIZ, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 5, C13GX.LIZ, str4);
                    i |= 32;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, EffectPanelModel effectPanelModel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        EffectPanelModel.write$Self(effectPanelModel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
