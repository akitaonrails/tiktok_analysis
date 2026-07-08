package com.ss.android.ugc.aweme.inbox.router;

import X.C1976907ol;
import android.net.Uri;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEditProcessOptInterceptor implements IInterceptor {
    public static final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//inbox/bulletin_board/post_text", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r6, com.bytedance.router.RouteIntent r7) {
        /*
            r5 = this;
            r3 = 0
            if (r7 == 0) goto L17
            android.net.Uri r0 = r7.getUri()
        L7:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.C0OPX.LJII(r0)
            if (r7 == 0) goto L24
            android.content.Intent r0 = r7.getExtra()
            if (r0 == 0) goto L24
            goto L19
        L17:
            r0 = r3
            goto L7
        L19:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L24
            goto L27
        L20:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L24:
            r1 = 0
            goto L39
        L27:
            java.lang.String r0 = "bulletin_board_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L24
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L24
            long r1 = r0.longValue()
        L39:
            X.0OVa r4 = new X.0OVa
            if (r7 == 0) goto L6e
            android.net.Uri r0 = r7.getUri()
        L41:
            r4.<init>(r1, r0)
            if (r7 == 0) goto L52
            android.net.Uri r1 = r7.getUri()
            if (r1 == 0) goto L52
            java.lang.String r0 = "enter_method"
            java.lang.String r3 = X.C1907940zkW.LIZIZ(r1, r0)
        L52:
            java.lang.String r0 = "bulletin_board_analytics"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L6a
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = com.ss.android.ugc.aweme.inbox.router.BulletinEditProcessOptInterceptor.LL
            Y.ARunnableS109S0100000_9 r2 = new Y.ARunnableS109S0100000_9
            r0 = 93
            r2.<init>(r4, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
        L68:
            r0 = 1
            return r0
        L6a:
            X.C1440005kM.LIZ(r4)
            goto L68
        L6e:
            r0 = r3
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.router.BulletinEditProcessOptInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
