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
public /* synthetic */ class PanelInfoModel$Extra$$serializer implements C13H1<PanelInfoModel.Extra> {
    public static final PanelInfoModel$Extra$$serializer INSTANCE;
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
        PanelInfoModel$Extra$$serializer panelInfoModel$Extra$$serializer = new PanelInfoModel$Extra$$serializer();
        INSTANCE = panelInfoModel$Extra$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel.Extra", panelInfoModel$Extra$$serializer, 3);
        c19983913Gz.LJIIJ("rec_id", true);
        c19983913Gz.LJIIJ("filtered_effects", true);
        c19983913Gz.LJIIJ("effect_recommend", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = PanelInfoModel.Extra.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, C19983613Gw.LIZ(c01gwArr[1].getValue()), c13gx};
    }

    @Override // X.InterfaceC19984213Hc
    public final PanelInfoModel.Extra deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = PanelInfoModel.Extra.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        List list = null;
        String strLJIILL2 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ == 2) {
                            strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 2);
                            i |= 4;
                        } else {
                            throw new C13II(iLJIJJ);
                        }
                    } else {
                        list = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list);
                        i |= 2;
                    }
                } else {
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new PanelInfoModel.Extra(i, strLJIILL, list, strLJIILL2, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, PanelInfoModel.Extra extra) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        PanelInfoModel.Extra.write$Self$ckresource_model_release(extra, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
