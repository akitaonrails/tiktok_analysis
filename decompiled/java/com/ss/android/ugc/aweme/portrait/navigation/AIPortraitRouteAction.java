package com.ss.android.ugc.aweme.portrait.navigation;

import X.C098200Yq;
import X.C189200o6;
import X.C547790Le5;
import X.C786410Ut5;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        Object c098200Yq;
        IAIPortraitLauncher iAIPortraitLauncherLIZ;
        String str2 = "";
        if (context == null) {
            return Boolean.FALSE;
        }
        if (str == null) {
            str = "";
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return Boolean.FALSE;
        }
        StringBuilder sb = new StringBuilder("//");
        String host = uri.getHost();
        if (host == null) {
            host = "";
        }
        sb.append(host);
        String path = uri.getPath();
        if (path != null) {
            str2 = path;
        }
        sb.append(str2);
        String string = sb.toString();
        if (bundle == null) {
            bundle = new Bundle();
        }
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String str3 : queryParameterNames) {
                if (!bundle.containsKey(str3)) {
                    C786410Ut5.LJJJI(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3), bundle);
                }
            }
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (iAIPortraitLauncherLIZ = iAIPortraitFeatureServiceLIZ.LIZ()) != null) {
            return Boolean.valueOf(iAIPortraitLauncherLIZ.handlePortraitRoute(context, string, bundle));
        }
        return Boolean.FALSE;
    }
}
