package com.bytedance.router.interceptor;

import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class RewriteManager implements IInterceptor {
    public Object mLockObject = new Object();
    public Map<String, String> mRewriteMap;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public String getRewriteUrl(String str) {
        Map<String, String> map = this.mRewriteMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Map<String, String> map;
        String originUrl = routeIntent.getOriginUrl();
        if (TextUtils.isEmpty(originUrl)) {
            return false;
        }
        String routeUrl = Util.getRouteUrl(originUrl);
        if (!TextUtils.isEmpty(routeUrl) && (map = this.mRewriteMap) != null && map.size() != 0) {
            String str = this.mRewriteMap.get(routeUrl);
            if (!TextUtils.isEmpty(str)) {
                routeIntent.setUrl(str);
                return true;
            }
        }
        return false;
    }

    public void setRewriteMap(Map<String, String> map) {
        synchronized (this.mLockObject) {
            try {
                if (map == null) {
                    this.mRewriteMap = Collections.EMPTY_MAP;
                } else {
                    this.mRewriteMap = map;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addRewriteValue(String str, String str2) {
        synchronized (this.mLockObject) {
            try {
                if (this.mRewriteMap == null) {
                    this.mRewriteMap = new HashMap();
                }
                this.mRewriteMap.put(str, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewriteManager#RouteIntent-originUrl: ");
        sbLIZ.append(routeIntent.getOriginUrl());
        Logger.d(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RewriteManager#RouteIntent-outputUrl: ");
        sbLIZ2.append(routeIntent.getUrl());
        Logger.d(C2188811AlT.LIZIZ(sbLIZ2));
        new RouteIntent.Builder(routeIntent.getUrl()).build();
        return false;
    }
}
