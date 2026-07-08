package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13H1;
import X.C13H3;
import X.C13HB;
import X.C13HD;
import X.C13HG;
import X.C13HO;
import X.C13II;
import X.C19983613Gw;
import X.C19983913Gz;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class CategoryPageModel$$serializer implements C13H1<CategoryPageModel> {
    public static final CategoryPageModel$$serializer INSTANCE;
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
        CategoryPageModel$$serializer categoryPageModel$$serializer = new CategoryPageModel$$serializer();
        INSTANCE = categoryPageModel$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel", categoryPageModel$$serializer, 4);
        c19983913Gz.LJIIJ("category_effects", true);
        c19983913Gz.LJIIJ("url_prefix", true);
        c19983913Gz.LJIIJ("extra", true);
        c19983913Gz.LJIIJ("isCache", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        return new C13HG[]{C19983613Gw.LIZ(CategoryEffectModel$$serializer.INSTANCE), CategoryPageModel.$childSerializers[1].getValue(), C19983613Gw.LIZ(CategoryPageModel$Extra$$serializer.INSTANCE), C13HO.LIZ};
    }

    @Override // X.InterfaceC19984213Hc
    public final CategoryPageModel deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = CategoryPageModel.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        CategoryEffectModel categoryEffectModel = null;
        int i = 0;
        boolean zLJFF = false;
        List list = null;
        CategoryPageModel.Extra extra = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ != 2) {
                            if (iLJIJJ == 3) {
                                zLJFF = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 3);
                                i |= 8;
                            } else {
                                throw new C13II(iLJIJJ);
                            }
                        } else {
                            extra = (CategoryPageModel.Extra) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, CategoryPageModel$Extra$$serializer.INSTANCE, extra);
                            i |= 4;
                        }
                    } else {
                        list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list);
                        i |= 2;
                    }
                } else {
                    categoryEffectModel = (CategoryEffectModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 0, CategoryEffectModel$$serializer.INSTANCE, categoryEffectModel);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new CategoryPageModel(i, categoryEffectModel, list, extra, zLJFF, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, CategoryPageModel categoryPageModel) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        CategoryPageModel.write$Self(categoryPageModel, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
