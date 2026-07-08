package com.ss.android.ugc.aweme.subscription.pgc.serviceimpl;

import X.C0KFS;
import X.C0KLU;
import X.C516000KLm;
import android.app.Activity;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILiveSdkSubscriptionOtherServicePgc;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSdkSubscriptionOtherServicePgc implements ILiveSdkSubscriptionOtherServicePgc {
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILiveSdkSubscriptionOtherServicePgc
    public final C516000KLm LIZJ() {
        return C516000KLm.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILiveSdkSubscriptionOtherServicePgc
    public final void LIZ(Activity activity, C0KFS c0kfs) {
        C0KLU.LIZ.triggerInAppMessages(activity, c0kfs.getKey());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILiveSdkSubscriptionOtherServicePgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment LIZIZ(android.content.Context r18, X.C512570K8h r19, webcast.api.sub.SubPriceChangeConfirmRequest r20, java.lang.String r21) {
        /*
            r17 = this;
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r1
            r2 = 0
            if (r1 != 0) goto L36
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Throwable -> L21
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r1 = r1.getService(r0)     // Catch: java.lang.Throwable -> L21
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r1     // Catch: java.lang.Throwable -> L21
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L21
            goto L2d
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L2d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L34
            r1 = r2
        L34:
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r1
        L36:
            if (r1 == 0) goto L39
            goto L3b
        L39:
            r1 = r2
            goto L61
        L3b:
            X.0K77 r3 = r1.C3()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L39
            r0 = r19
            boolean r5 = r0.LIZ     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = r0.LIZIZ     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r0.LIZJ     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = r0.LIZLLL     // Catch: java.lang.Throwable -> L65
            java.lang.String r9 = r0.LJ     // Catch: java.lang.Throwable -> L65
            java.lang.String r10 = r0.LJFF     // Catch: java.lang.Throwable -> L65
            java.lang.String r11 = r0.LJI     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = r0.LJII     // Catch: java.lang.Throwable -> L65
            kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r0.LJIIIIZZ     // Catch: java.lang.Throwable -> L65
            kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r0.LJIIIZ     // Catch: java.lang.Throwable -> L65
            r16 = r21
            r15 = r20
            r4 = r18
            androidx.fragment.app.Fragment r1 = r3.LJJJJJL(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L65
        L61:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L65
            goto L71
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L71:
            X.C189200o6.m5exceptionOrNullimpl(r1)
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L7b
            r2 = r1
        L7b:
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.LiveSdkSubscriptionOtherServicePgc.LIZIZ(android.content.Context, X.0K8h, webcast.api.sub.SubPriceChangeConfirmRequest, java.lang.String):androidx.fragment.app.Fragment");
    }
}
