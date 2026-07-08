package com.ss.android.ugc.aweme.openauthorize;

import X.C1976907ol;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class OpenAuthorizeParseInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String path;
        if (routeIntent == null || (path = routeIntent.getPath()) == null || !a0.LJJIIZI(path, "aweme://authorize", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strLJJIFFI;
        String strLJJIFFI2;
        String strLJJIFFI3;
        if (context != null && routeIntent != null) {
            Bundle bundle = new Bundle();
            Intent extra = routeIntent.getExtra();
            String string = null;
            if (extra != null) {
                try {
                    Bundle extras = extra.getExtras();
                    if (extras != null) {
                        string = extras.toString();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (string != null && a0.LJJIIZI(string, "\\u0026", false)) {
                if (string != null && (strLJJIFFI = u.LJJIFFI(string, "\\u0026", "&", false)) != null && (strLJJIFFI2 = u.LJJIFFI(strLJJIFFI, "Bundle[{", "", false)) != null && (strLJJIFFI3 = u.LJJIFFI(strLJJIFFI2, "}]", "", false)) != null) {
                    Iterator it2 = a0.LJJLIIIJILLIZJL(strLJJIFFI3, new String[]{"&"}, 0, 6).iterator();
                    while (it2.hasNext()) {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                        if (listLJJLIIIJILLIZJL.size() >= 2) {
                            C786410Ut5.LJJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), (String) ListProtector.get(listLJJLIIIJILLIZJL, 1), bundle);
                        }
                    }
                }
            } else {
                Intent extra2 = routeIntent.getExtra();
                if (extra2 != null) {
                    try {
                        bundle = extra2.getExtras();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                } else {
                    bundle = new Bundle();
                }
            }
            if (bundle.getString("client_key") != null && bundle.getString("scope") != null) {
                if (bundle.getString("token") == null && bundle.getString("bc_params") == null) {
                    return false;
                }
                String string2 = bundle.getString("authType");
                if (string2 != null) {
                    bundle.putInt("authType", CastIntegerProtector.parseInt(string2));
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://authorize");
                smartRouteBuildRoute.withParam("_bytedance_params_client_key", bundle.getString("client_key"));
                smartRouteBuildRoute.withParam("_bytedance_params_client_secret", bundle.getString("client_ticket"));
                smartRouteBuildRoute.withParam("_bytedance_params_next_url", bundle.getString("next_url"));
                smartRouteBuildRoute.withParam("_bytedance_params_scope", bundle.getString("scope"));
                smartRouteBuildRoute.withParam("key_qrcode_auth", true);
                smartRouteBuildRoute.withParam("key_qrcode_token", bundle.getString("token"));
                smartRouteBuildRoute.withParam("key_qrcode_bc_params", bundle.getString("bc_params"));
                smartRouteBuildRoute.withParam("key_qrcode_redirect_uri", bundle.getString("redirect_url"));
                smartRouteBuildRoute.withParam("key_qrcode_state", bundle.getString("state"));
                smartRouteBuildRoute.withParam("_bytedance_params_extra", bundle);
                smartRouteBuildRoute.open();
                return true;
            }
        }
        return false;
    }
}
