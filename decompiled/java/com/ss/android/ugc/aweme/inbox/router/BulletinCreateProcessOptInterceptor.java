package com.ss.android.ugc.aweme.inbox.router;

import X.C1976907ol;
import X.C618480ONq;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinCreateFragment;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreateProcessOptInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "aweme://inbox/bulletin_board/create", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle extras;
        Intent extra;
        C618480ONq c618480ONq = BulletinCreateFragment.LLIZLLLIL;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            try {
                extras = extra.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        c618480ONq.getClass();
        C618480ONq.LIZ(context, extras, null);
        return true;
    }
}
