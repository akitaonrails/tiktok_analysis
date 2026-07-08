package com.ss.android.ugc.aweme.im.saas.host.impl.analytics;

import X.C1229100i5c;
import com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAnalyticsHelper implements IIMAnalyticsHelper {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper
    public final String LIZIZ(String str) {
        return C1229100i5c.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper
    public final String LIZ(String str, boolean z) {
        if (z) {
            if (C1229100i5c.LIZ.LJIIJJI(str)) {
                return "public_group";
            }
            return "group";
        }
        return "private";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C058C
            if (r0 == 0) goto L55
            r5 = r8
            X.058C r5 = (X.C058C) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L5b
            X.C155000ia.LIZIZ(r1)
        L23:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
            if (r1 == 0) goto L35
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r1.getImUserBizInfo()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r0.getUserB2CAccountInfo()
            if (r0 == 0) goto L35
            java.lang.String r3 = r0.userTags
        L35:
            return r3
        L36:
            X.C155000ia.LIZIZ(r1)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            X.0ZFW r0 = X.C0ZFW.LIZ
            java.lang.String r0 = r0.LJJIFFI(r7)
            r5.LLILLL = r2
            java.lang.Object r1 = r1.LJIJ(r0, r3, r5)
            if (r1 != r4) goto L23
            return r4
        L55:
            X.058C r5 = new X.058C
            r5.<init>(r6, r8)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.analytics.IMAnalyticsHelper.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
