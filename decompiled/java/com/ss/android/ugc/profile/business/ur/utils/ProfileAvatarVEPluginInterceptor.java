package com.ss.android.ugc.profile.business.ur.utils;

import X.C1881607Yo;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginInterceptor;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileAvatarVEPluginInterceptor extends VEPluginInterceptor {
    public static final C1881607Yo Companion = new Object() { // from class: X.07Yo
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginInterceptor, com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//prod/profile/avatar_choose", false)) {
            return false;
        }
        return true;
    }
}
