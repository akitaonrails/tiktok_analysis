package com.ss.android.ugc.aweme.compliance.business.policynotice.routeaction;

import X.C0XQ7;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes14.dex */
public final class LogoutCurrentUserRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        C0XQ7.LIZJ().logout("router_action", "user_logout");
        return Boolean.TRUE;
    }
}
