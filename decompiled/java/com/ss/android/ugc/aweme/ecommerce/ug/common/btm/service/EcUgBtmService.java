package com.ss.android.ugc.aweme.ecommerce.ug.common.btm.service;

import X.C1740590vOb;
import X.C1740600vOc;
import X.C1740610vOd;
import X.C1AF0;
import X.EnumC1741430vPx;
import X.EnumC1741440vPy;
import android.net.Uri;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgBtmService implements IEcUgBtmService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService
    public final String LIZJ(C1740600vOc c1740600vOc) {
        try {
            String str = c1740600vOc.LIZIZ;
            if (str == null) {
                return BtmSDK.INSTANCE.createJumpSourceBtmToken(c1740600vOc.LIZ);
            }
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService
    public final Map<String, Object> LJ(C1740600vOc c1740600vOc) {
        return C1740590vOb.LIZ(c1740600vOc);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService
    public final void LIZ(C1740600vOc c1740600vOc, Uri.Builder builder) {
        try {
            String strCreateJumpSourceBtmToken = c1740600vOc.LIZIZ;
            if ((strCreateJumpSourceBtmToken != null || (strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(c1740600vOc.LIZ)) != null) && strCreateJumpSourceBtmToken.length() != 0) {
                builder.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService
    public final String LIZLLL(C1740600vOc c1740600vOc, String str) {
        return C1740590vOb.LIZIZ(c1740600vOc, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService
    public final void LIZIZ(EnumC1741430vPx enumC1741430vPx, EnumC1741440vPy enumC1741440vPy, String str) {
        C1740610vOd.LIZ.getClass();
        C1740610vOd.LIZ(enumC1741430vPx, enumC1741440vPy, str);
    }
}
