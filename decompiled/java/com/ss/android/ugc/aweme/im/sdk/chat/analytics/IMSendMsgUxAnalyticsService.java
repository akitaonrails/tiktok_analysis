package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.C903780Zcu;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSendMsgUxAnalyticsService implements IIMSendMsgUxAnalytics {
    public static final boolean LIZIZ;
    public final /* synthetic */ IIMSendMsgUxAnalytics LIZ;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final Map<String, String> LIZ(Map<String, String> map) {
        return this.LIZ.LIZ(map);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LIZIZ(long j) {
        this.LIZ.LIZIZ(j);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LIZJ(long j, int i, Map map) {
        this.LIZ.LIZJ(j, i, map);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LJ(int i, String str, Map map) {
        this.LIZ.LJ(i, str, map);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LJFF(long j, Map map) {
        this.LIZ.LJFF(j, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    static {
        /*
            X.13Lf r1 = X.AbstractC19994813Le.Default
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r1.nextInt(r0)
            if (r0 == 0) goto L1f
            X.0W8I r0 = X.C0W8I.LIZ
            r0.getClass()
            boolean r0 = X.C0W8I.LIZIZ()
            if (r0 != 0) goto L1f
            boolean r0 = X.C0W8I.LIZJ()
            if (r0 != 0) goto L1f
            r0 = 0
        L1c:
            com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSendMsgUxAnalyticsService.LIZIZ = r0
            return
        L1f:
            r0 = 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSendMsgUxAnalyticsService.<clinit>():void");
    }

    public IMSendMsgUxAnalyticsService() {
        this.LIZ = LIZIZ ? new C903780Zcu(0) : new IIMSendMsgUxAnalytics() { // from class: X.0Zcd
            @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
            public final Map<String, String> LIZ(Map<String, String> map) {
                return map;
            }

            @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
            public final void LIZIZ(long j) {
            }

            @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
            public final void LIZJ(long j, int i, Map map) {
            }

            @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
            public final void LIZLLL() {
            }

            @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
            public final void LJ(int i, String str, Map map) {
            }

            @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
            public final void LJFF(long j, Map map) {
            }
        };
    }
}
