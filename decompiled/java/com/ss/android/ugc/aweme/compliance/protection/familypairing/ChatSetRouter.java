package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import X.C1388190mED;
import X.C1976907ol;
import X.InterfaceC19725812Fs;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class ChatSetRouter implements InterfaceC19725812Fs, IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return a0.LJJIIZI(routeIntent.getOriginUrl(), "privacy/setting/modify", false);
    }

    @Override // X.InterfaceC19725812Fs
    public final boolean open(String str) {
        return LIZ(null, str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    @Override // X.InterfaceC19725812Fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.app.Activity r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.familypairing.ChatSetRouter.LIZ(android.app.Activity, java.lang.String):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        LIZ(C1388190mED.LIZ(context), routeIntent.getOriginUrl());
        return true;
    }
}
