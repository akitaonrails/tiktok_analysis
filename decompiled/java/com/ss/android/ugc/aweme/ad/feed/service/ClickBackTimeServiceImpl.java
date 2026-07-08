package com.ss.android.ugc.aweme.ad.feed.service;

import X.C01GW;
import X.C1486505rr;
import X.C1486605rs;
import X.C1486705rt;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import Y.ARunnableS102S0100000_2;
import android.os.Handler;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ad.feed.IClickBackTimeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ClickBackTimeServiceImpl implements IClickBackTimeService {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS187S0000000_2.get$arr$(168));
    public final LinkedHashMap<String, C1486605rs> LIZIZ = new LinkedHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[PHI: r3
      0x0047: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:19:0x0044, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r1 = 0
            if (r4 == 0) goto L49
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
            if (r0 == 0) goto L43
            java.lang.String r3 = r0.getCreativeIdStr()
        Ld:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
            if (r0 == 0) goto L47
            int r0 = r0.getRit()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r0.toString()
        L1f:
            if (r3 == 0) goto L49
            int r0 = r3.length()
            if (r0 == 0) goto L49
            if (r2 == 0) goto L49
            int r0 = r2.length()
            if (r0 == 0) goto L49
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            r0 = 95
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        L43:
            r3 = r1
            if (r4 == 0) goto L47
            goto Ld
        L47:
            r2 = r1
            goto L1f
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.service.ClickBackTimeServiceImpl.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IClickBackTimeService
    public final void LIZ(Aweme aweme) {
        C786410Ut5.LJJZZIII((Handler) this.LIZ.getValue(), new ARunnableS102S0100000_2(new C1486505rr(aweme, this, SystemClock.elapsedRealtime()), 14));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IClickBackTimeService
    public final void LIZIZ(Aweme aweme, String str, String str2) {
        C786410Ut5.LJJZZIII((Handler) this.LIZ.getValue(), new ARunnableS102S0100000_2(new C1486705rt(this, aweme, str, str2, SystemClock.elapsedRealtime()), 14));
    }
}
