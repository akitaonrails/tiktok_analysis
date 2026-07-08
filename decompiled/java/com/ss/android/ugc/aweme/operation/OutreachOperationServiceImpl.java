package com.ss.android.ugc.aweme.operation;

import X.AbstractC1549150qPp;
import X.C1054060dXI;
import X.C2162308dZ;
import X.C2214711Bm9;
import android.content.Context;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class OutreachOperationServiceImpl implements OutreachOperationService {
    @Override // com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService
    public final List<IInterceptor> LIZ() {
        return Collections.singletonList(new OutreachOperationRouterInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZIZ() {
        return Collections.singletonList(C2214711Bm9.class);
    }

    @Override // com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService
    public final boolean LIZJ(Context context, boolean z) {
        C1054060dXI.LIZ.getClass();
        if (!z) {
            return C2162308dZ.LJFF(context, "com.nc.tiktok.usmain");
        }
        return C2162308dZ.LJFF(context, "com.tiktok.lite.go");
    }

    @Override // com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService
    public final boolean LIZLLL(Context context, String str) {
        C1054060dXI.LIZ.getClass();
        return C2162308dZ.LJFF(context, str);
    }
}
