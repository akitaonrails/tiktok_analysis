package com.ss.android.ugc.effectmanager.effect.model;

import X.C13GX;
import X.C13H1;
import X.C13H3;
import X.C13H6;
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
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class CategoryPageModel$FilterEffect$$serializer implements C13H1<CategoryPageModel.FilterEffect> {
    public static final CategoryPageModel$FilterEffect$$serializer INSTANCE;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13H6 c13h6 = C13H6.LIZ;
        return new C13HG[]{C19983613Gw.LIZ(c13h6), C19983613Gw.LIZ(c13h6), C19983613Gw.LIZ(C13GX.LIZ)};
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
        CategoryPageModel$FilterEffect$$serializer categoryPageModel$FilterEffect$$serializer = new CategoryPageModel$FilterEffect$$serializer();
        INSTANCE = categoryPageModel$FilterEffect$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel.FilterEffect", categoryPageModel$FilterEffect$$serializer, 3);
        c19983913Gz.LJIIJ("Id", true);
        c19983913Gz.LJIIJ("ReasonCode", true);
        c19983913Gz.LJIIJ("ReasonMsg", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final CategoryPageModel.FilterEffect deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        Long l = null;
        int i = 0;
        Long l2 = null;
        String str = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ == 2) {
                            str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, C13GX.LIZ, str);
                            i |= 4;
                        } else {
                            throw new C13II(iLJIJJ);
                        }
                    } else {
                        l2 = (Long) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, C13H6.LIZ, l2);
                        i |= 2;
                    }
                } else {
                    l = (Long) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 0, C13H6.LIZ, l);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new CategoryPageModel.FilterEffect(i, l, l2, str, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, CategoryPageModel.FilterEffect filterEffect) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        CategoryPageModel.FilterEffect.write$Self$ckresource_model_release(filterEffect, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
