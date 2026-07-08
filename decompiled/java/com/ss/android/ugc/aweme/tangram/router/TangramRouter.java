package com.ss.android.ugc.aweme.tangram.router;

import X.C1976907ol;
import X.C2188811AlT;
import X.C580990MqX;
import X.C7740030o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ITangramService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class TangramRouter implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return a0.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ), "startCreation", false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        CreationConfigModelCompat creationConfigModelCompat;
        if (context == null || routeIntent == null) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        String string = null;
        if (extra != null) {
            try {
                Bundle extras = extra.getExtras();
                if (extras != null) {
                    string = extras.getString("json");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if ((string != null && string.length() == 0) || (creationConfigModelCompat = (CreationConfigModelCompat) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, CreationConfigModelCompat.class)) == null) {
            return false;
        }
        if (Intrinsics.LJFF(creationConfigModelCompat.getPageStack(), "1")) {
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null) {
                iExternalService.asyncService(context, "deep_link_startCreation", new C580990MqX(context, creationConfigModelCompat, 15));
            }
            return true;
        }
        ITangramService iTangramService = (ITangramService) PluggableExtentionKt.pluggableSpi$default(ITangramService.class, false, false, false, 14, null);
        if (iTangramService != null) {
            ITangramService.DefaultImpls.start$default(iTangramService, context, creationConfigModelCompat, null, null, 12, null);
        }
        return true;
    }
}
