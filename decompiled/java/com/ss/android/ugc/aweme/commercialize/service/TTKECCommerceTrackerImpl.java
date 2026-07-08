package com.ss.android.ugc.aweme.commercialize.service;

/* JADX INFO: loaded from: classes3.dex */
public final class TTKECCommerceTrackerImpl implements TTKECCommerceTracker {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.TTKECCommerceTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            X.01GW r0 = X.C04UF.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            if (r5 == 0) goto L4b
            boolean r0 = r5.isAd()
            r2 = 1
            if (r0 != r2) goto L4b
            java.lang.String r1 = "1"
        L1e:
            java.lang.String r0 = "is_ad"
            r3.put(r0, r1)
            if (r2 == 0) goto L48
            r2 = 0
            if (r5 == 0) goto L49
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L49
            java.lang.Long r1 = r0.getAdId()
        L32:
            java.lang.String r0 = "ad_id"
            r3.put(r0, r1)
            if (r5 == 0) goto L43
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L43
            java.lang.Long r2 = r0.getCreativeId()
        L43:
            java.lang.String r0 = "creative_id"
            r3.put(r0, r2)
        L48:
            return r3
        L49:
            r1 = r2
            goto L32
        L4b:
            r2 = 0
            java.lang.String r1 = "0"
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.service.TTKECCommerceTrackerImpl.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.Map");
    }
}
