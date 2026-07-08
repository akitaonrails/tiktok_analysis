package com.ss.android.ugc.aweme.privacy;

import com.ss.android.ugc.aweme.ad.privacy.ICommerceLandingPagePrivacyService;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceLandpagePrivacyService implements ICommerceLandingPagePrivacyService {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2.equals("EEA") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r2.equals("UK") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r2.equals("CH") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        return X.C1075220e5Q.LIZ().eeaPrivacyPolicyUrl;
     */
    @Override // com.ss.android.ugc.aweme.ad.privacy.ICommerceLandingPagePrivacyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r3 = this;
            X.14c6 r0 = X.C20301014c4.LIZ
            X.14c6 r0 = X.C20301014c4.LIZ
            java.lang.String r1 = r0.LIZIZ
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toUpperCase(r0)
            int r1 = r2.hashCode()
            r0 = 2149(0x865, float:3.011E-42)
            if (r1 == r0) goto L48
            r0 = 2710(0xa96, float:3.798E-42)
            if (r1 == r0) goto L3f
            r0 = 2718(0xa9e, float:3.809E-42)
            if (r1 == r0) goto L30
            r0 = 68513(0x10ba1, float:9.6007E-41)
            if (r1 != r0) goto L29
            java.lang.String r0 = "EEA"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L51
        L29:
            com.ss.android.ugc.aweme.ad.settings.AdLandingPagePrivacyPolicyConfigModel r0 = X.C1075220e5Q.LIZ()
            java.lang.String r0 = r0.rowPrivacyPolicyUrl
            return r0
        L30:
            java.lang.String r0 = "US"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L29
            com.ss.android.ugc.aweme.ad.settings.AdLandingPagePrivacyPolicyConfigModel r0 = X.C1075220e5Q.LIZ()
            java.lang.String r0 = r0.usPrivacyPolicyUrl
            return r0
        L3f:
            java.lang.String r0 = "UK"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L51
            goto L29
        L48:
            java.lang.String r0 = "CH"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L51
            goto L29
        L51:
            com.ss.android.ugc.aweme.ad.settings.AdLandingPagePrivacyPolicyConfigModel r0 = X.C1075220e5Q.LIZ()
            java.lang.String r0 = r0.eeaPrivacyPolicyUrl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.privacy.CommerceLandpagePrivacyService.LIZ():java.lang.String");
    }
}
