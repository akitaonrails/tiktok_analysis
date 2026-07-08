package com.lynx.animax.service;

import X.C1285680jYs;
import X.C1285760jZ0;
import X.C1289650jfH;
import X.InterfaceC1285780jZ2;
import X.InterfaceC1285790jZ3;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXFrescoImageService implements IAnimaXImageService, IAutoRegisterAnimaXService {
    @Override // com.lynx.animax.service.IAutoRegisterAnimaXService
    public final /* synthetic */ C1285680jYs getAutoRegisterServiceScope() {
        return C1285760jZ0.LIZ(this);
    }

    @Override // com.lynx.animax.service.IAutoRegisterAnimaXService
    public Class<? extends IAnimaXService> getServiceClass() {
        return IAnimaXImageService.class;
    }

    @Override // com.lynx.animax.service.IAnimaXImageService
    public boolean loadImage(InterfaceC1285790jZ3 interfaceC1285790jZ3, InterfaceC1285780jZ2 interfaceC1285780jZ2) {
        return C1289650jfH.LIZ(interfaceC1285790jZ3, interfaceC1285780jZ2);
    }
}
