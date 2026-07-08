package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AnonymousClass0317;
import X.C034S;
import X.C1120604Zw;
import X.C13LQ;
import X.C1759000vsI;
import X.C1976907ol;
import X.C1AF0;
import X.C1AQS;
import X.C2188811AlT;
import X.C7879035x;
import X.C823050WQl;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSchemaFallbackInterceptor;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.LocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomSchemaFallbackInterceptor implements IInterceptor {
    public static final Set<String> LLILLL = C13LQ.LJLIIL(new String[]{"aweme://ec/pdp", "aweme://ec/sku", "aweme://ec/store", "aweme://ec/showcase", "aweme://ec/shop_message", "aweme://ec/delivery", "aweme://ec/address/list", "aweme://ec/address/edit", "aweme://ec/order_center"});
    public volatile boolean LL;
    public volatile HashMap<String, SchemaFallbackConfig> LLILLJJLI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public final void LIZ() {
        AnonymousClass0317 anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin;
        Map<String, String> downGradeList;
        HashMap<String, SchemaFallbackConfig> map = new HashMap<>();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SchemaFallbackConfig[] schemaFallbackConfigArr = C1759000vsI.LIZ;
        SchemaFallbackConfig[] schemaFallbackConfigArr2 = (SchemaFallbackConfig[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_schema_fallback_config", SchemaFallbackConfig[].class, schemaFallbackConfigArr);
        if (schemaFallbackConfigArr2 != null) {
            schemaFallbackConfigArr = schemaFallbackConfigArr2;
        }
        ArrayList<SchemaFallbackConfig> arrayList = new ArrayList();
        for (SchemaFallbackConfig schemaFallbackConfig : schemaFallbackConfigArr) {
            if (LLILLL.contains(schemaFallbackConfig.key)) {
                arrayList.add(schemaFallbackConfig);
            }
        }
        for (SchemaFallbackConfig schemaFallbackConfig2 : arrayList) {
            map.put(schemaFallbackConfig2.key, schemaFallbackConfig2);
        }
        this.LLILLJJLI = map;
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        if (C7879035x.LIZLLL()) {
            try {
                if (C034S.LIZ()) {
                    c1120604Zw.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin = LocalTestDependencyService.createILocalTestDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, ILocalTestDependencyService.class.getName(), anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin != null);
                } else {
                    c1120604Zw.LIZ();
                    anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocalTestDependencyService.class);
                }
                ILocalTestDependencyService iLocalTestDependencyService = (ILocalTestDependencyService) anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin;
                if (iLocalTestDependencyService.enableManualDowngrade() && (downGradeList = iLocalTestDependencyService.getDownGradeList()) != null) {
                    ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).updateFallbackConfig(downGradeList);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        this.LL = true;
    }

    public EcomSchemaFallbackInterceptor() {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0vsG
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EcomSchemaFallbackInterceptor@f2ba.<init>$1");
                try {
                    final EcomSchemaFallbackInterceptor ecomSchemaFallbackInterceptor = this.LL;
                    ecomSchemaFallbackInterceptor.LIZ();
                    SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0vsH
                        @Override // X.InterfaceC304970BxP
                        public final void LIZ() {
                            C823050WQl.LIZJ().execute(new ARunnableS126S0100000_26(ecomSchemaFallbackInterceptor, 4));
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EcomSchemaFallbackInterceptor@f2ba.<init>$1");
            }
        });
    }

    public static String LIZIZ(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getScheme());
            sbLIZ.append("://");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        String authority = uri.getAuthority();
        if (authority != null && authority.length() > 0) {
            sb.append(uri.getAuthority());
        }
        String path = uri.getPath();
        if (path != null && path.length() > 0) {
            sb.append(uri.getPath());
        }
        return sb.toString();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && routeIntent.getUri() != null) {
            if (!this.LL) {
                LIZ();
            }
            HashMap<String, SchemaFallbackConfig> map = this.LLILLJJLI;
            Set<String> queryParameterNames = null;
            if (map == null) {
                map = null;
            }
            if (!map.isEmpty() && (uri = routeIntent.getUri()) != null) {
                String strLIZIZ = LIZIZ(uri);
                HashMap<String, SchemaFallbackConfig> map2 = this.LLILLJJLI;
                if (map2 == null) {
                    map2 = null;
                }
                if (map2.get(strLIZIZ) != null) {
                    Uri uri2 = routeIntent.getUri();
                    if (uri2 != null) {
                        queryParameterNames = UriProtector.getQueryParameterNames(uri2);
                    }
                    if (queryParameterNames != null && Boolean.valueOf(queryParameterNames.contains("fallback")) != null && !queryParameterNames.contains("fallback")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || routeIntent.getUri() == null || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        String strLIZIZ = LIZIZ(uri);
        HashMap<String, SchemaFallbackConfig> map = this.LLILLJJLI;
        if (map == null) {
            map = null;
        }
        SchemaFallbackConfig schemaFallbackConfig = map.get(strLIZIZ);
        if (schemaFallbackConfig != null) {
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder builderEncodedPath = builder.scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                builderEncodedPath.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
            builder.appendQueryParameter("fallback", schemaFallbackConfig.fallback);
            routeIntent.setUrl(builder.build().toString());
        }
        return false;
    }
}
