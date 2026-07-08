package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C2095008Iq;
import com.ss.android.ugc.aweme.service.IMiniDramaProfileLandingService;

/* JADX INFO: loaded from: classes.dex */
public final class MiniDramaProfileLandingServiceImpl implements IMiniDramaProfileLandingService {
    public volatile String LIZ;
    public volatile String LIZIZ;
    public volatile String LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // com.ss.android.ugc.aweme.service.IMiniDramaProfileLandingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map LIZIZ(long r9) {
        /*
            r8 = this;
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            long r3 = r7.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r6 = 1
            r5 = 0
            if (r0 > 0) goto L14
            r0 = 0
            r2 = 0
            if (r0 == 0) goto L18
        L14:
            java.lang.String r2 = r7.toString()
        L18:
            java.lang.String r1 = r8.LIZJ
            java.lang.String r4 = r8.LIZ
            java.lang.String r3 = r8.LIZIZ
            if (r2 == 0) goto L57
            int r0 = r2.length()
            if (r0 == 0) goto L57
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L57
            if (r4 == 0) goto L57
            int r0 = r4.length()
            if (r0 == 0) goto L57
            if (r3 == 0) goto L57
            int r0 = r3.length()
            if (r0 == 0) goto L57
            r0 = 2
            kotlin.Pair[] r2 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "collection_id"
            r1.<init>(r0, r4)
            r2[r5] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "video_id"
            r1.<init>(r0, r3)
            r2[r6] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r2)
            return r0
        L57:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaProfileLandingServiceImpl.LIZIZ(long):java.util.Map");
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaProfileLandingService
    public final void LIZ(String str, String str2, String str3, boolean z) {
        String string;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        if (z) {
            return;
        }
        String string2 = null;
        if (str != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str)) != null && lLJIILIIL2.longValue() > 0) {
            string = lLJIILIIL2.toString();
        } else {
            string = null;
        }
        if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null && lLJIILIIL.longValue() > 0) {
            string2 = lLJIILIIL.toString();
        }
        if (string != null && string.length() != 0 && str2 != null && str2.length() != 0 && string2 != null && string2.length() != 0) {
            this.LIZ = string;
            this.LIZIZ = str2;
            this.LIZJ = string2;
            System.currentTimeMillis();
        }
    }
}
