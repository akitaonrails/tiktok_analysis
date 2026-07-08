package com.bytedance.router.interceptor;

import android.content.Context;
import com.bytedance.router.RouteIntent;

/* JADX INFO: loaded from: classes4.dex */
public interface IInterceptor {
    boolean matchInterceptRules(RouteIntent routeIntent);

    boolean onInterceptRoute(Context context, RouteIntent routeIntent);

    boolean shouldHandleRoute(RouteIntent routeIntent);
}
