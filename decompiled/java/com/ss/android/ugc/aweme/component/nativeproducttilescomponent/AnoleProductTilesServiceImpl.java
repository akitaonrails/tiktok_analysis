package com.ss.android.ugc.aweme.component.nativeproducttilescomponent;

import X.C04TD;
import com.ss.android.ugc.aweme.IAnoleProductTilesService;

/* JADX INFO: loaded from: classes3.dex */
public final class AnoleProductTilesServiceImpl implements IAnoleProductTilesService {
    public int LIZ;

    public static IAnoleProductTilesService LIZJ() {
        Object objLIZ = C04TD.LIZ(IAnoleProductTilesService.class, false);
        if (objLIZ != null) {
            return (IAnoleProductTilesService) objLIZ;
        }
        if (C04TD.LLLLLLJ == null) {
            synchronized (IAnoleProductTilesService.class) {
                if (C04TD.LLLLLLJ == null) {
                    C04TD.LLLLLLJ = new AnoleProductTilesServiceImpl();
                }
            }
        }
        return C04TD.LLLLLLJ;
    }

    @Override // com.ss.android.ugc.aweme.IAnoleProductTilesService
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAnoleProductTilesService
    public final void LIZIZ(int i) {
        this.LIZ = i;
    }
}
