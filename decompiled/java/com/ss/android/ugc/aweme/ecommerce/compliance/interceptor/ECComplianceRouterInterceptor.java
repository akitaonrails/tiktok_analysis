package com.ss.android.ugc.aweme.ecommerce.compliance.interceptor;

import X.C1735100vFk;
import X.C1735130vFn;
import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.compliance.EcComplianceConfigModel;
import com.ss.android.ugc.aweme.ecommerce.compliance.ScenesConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class ECComplianceRouterInterceptor implements IInterceptor {
    public final List<String> LL = new ArrayList();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        List<ScenesConfig> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchInterceptRules: ");
        String host2 = null;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        C2188811AlT.LIZIZ(sbLIZ);
        if (routeIntent != null) {
            host2 = routeIntent.getHost();
        }
        if (!Intrinsics.LJFF(host2, "ec")) {
            return false;
        }
        String path = routeIntent.getPath();
        if (((ArrayList) this.LL).contains(path)) {
            return true;
        }
        EcComplianceConfigModel ecComplianceConfigModelLIZ = C1735130vFn.LIZ();
        if (ecComplianceConfigModelLIZ != null && (list = ecComplianceConfigModelLIZ.scenes) != null) {
            Iterator<ScenesConfig> it2 = list.iterator();
            while (it2.hasNext()) {
                List<String> list2 = it2.next().nativePaths;
                if (list2 != null) {
                    for (String str : list2) {
                        ((ArrayList) this.LL).add(str);
                        if (path != null && a0.LJJIIZI(path, str, false)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        String str;
        String url;
        List<ScenesConfig> list;
        if (routeIntent == null) {
            path = null;
        } else {
            try {
                path = routeIntent.getPath();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        EcComplianceConfigModel ecComplianceConfigModelLIZ = C1735130vFn.LIZ();
        if (ecComplianceConfigModelLIZ != null && (list = ecComplianceConfigModelLIZ.scenes) != null) {
            loop0: for (ScenesConfig scenesConfig : list) {
                List<String> list2 = scenesConfig.nativePaths;
                if (list2 != null) {
                    for (String str2 : list2) {
                        if (path != null && a0.LJJIIZI(path, str2, false)) {
                            str = scenesConfig.sceneName;
                            break loop0;
                        }
                    }
                }
            }
            str = null;
        } else {
            str = null;
        }
        C1735100vFk c1735100vFk = C1735100vFk.LIZ;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        c1735100vFk.getClass();
        C1735100vFk.LIZIZ(str, url, null, null);
        return false;
    }
}
