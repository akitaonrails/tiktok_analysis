package com.ss.android.ugc.aweme.inbox.router;

import X.C1976907ol;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardSheetInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String string;
        Uri uri;
        Bundle extras = null;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            string = uri.toString();
        } else {
            string = null;
            if (routeIntent != null) {
            }
            if (string != null || !a0.LJJIIZI(string, "//inbox/bulletin_board", false) || extras == null || !extras.containsKey("sheet_height_ratio")) {
                return false;
            }
            return true;
        }
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            try {
                extras = extra.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return string != null ? false : false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r11, com.bytedance.router.RouteIntent r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.router.BulletinBoardSheetInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
