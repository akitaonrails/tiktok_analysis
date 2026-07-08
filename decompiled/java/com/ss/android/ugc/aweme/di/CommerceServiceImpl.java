package com.ss.android.ugc.aweme.di;

import X.C04TD;
import X.C15H1;
import X.C15H2;
import android.content.Context;
import com.ss.android.ugc.aweme.main.service.ICommerceService;

/* JADX INFO: loaded from: classes32.dex */
public class CommerceServiceImpl implements ICommerceService {
    public final C15H1 LIZ = C15H2.LIZ;

    public static ICommerceService LIZJ() {
        Object objLIZ = C04TD.LIZ(ICommerceService.class, false);
        if (objLIZ != null) {
            return (ICommerceService) objLIZ;
        }
        if (C04TD.LLLLZIL == null) {
            synchronized (ICommerceService.class) {
                if (C04TD.LLLLZIL == null) {
                    C04TD.LLLLZIL = new CommerceServiceImpl();
                }
            }
        }
        return C04TD.LLLLZIL;
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final void LIZIZ() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean LIZ(Context context, String str) {
        return this.LIZ.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean openAdWebUrl(Context context, String str, String str2) {
        return this.LIZ.openAdWebUrl(context, str, str2);
    }
}
