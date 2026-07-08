package com.ss.android.ugc.aweme.story.route;

import X.C13LP;
import X.C1601110rld;
import X.C1697810uHb;
import X.C1976907ol;
import X.C2188811AlT;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryDetailInterceptor implements IInterceptor {
    public final String[] LL = {"aweme/detail", "tuwen/detail", "aweme/detaillist", "detail", "user/video", "story/detail"};

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String host;
        String path;
        Intent extra;
        String stringExtra;
        boolean z;
        String stringExtra2;
        if (!C1601110rld.LIZ()) {
            return false;
        }
        String stringExtra3 = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (uri != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (uri != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (u.LJJIIJZLJL(strLIZIZ, "story/detail", false)) {
            return true;
        }
        for (String str : this.LL) {
            if (u.LJJIIJZLJL(strLIZIZ, str, false)) {
                if (routeIntent == null || (extra = routeIntent.getExtra()) == null) {
                    return false;
                }
                if (extra.getBooleanExtra("is_from_story_client_share", false)) {
                    return true;
                }
                if (extra == null) {
                    return false;
                }
                try {
                    stringExtra = extra.getStringExtra("refer");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                    if (extra == null) {
                        return false;
                    }
                }
                if (extra.getIntExtra("video_type", -1) == 0 && C13LP.LJJJJ(stringExtra, C1697810uHb.LJIIJJI("personal_homepage", "others_homepage"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (extra != null) {
                    try {
                        stringExtra2 = extra.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        stringExtra2 = null;
                        if (extra != null) {
                        }
                        return !z ? false : false;
                    }
                    try {
                        stringExtra3 = extra.getStringExtra("userid");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                } else {
                    stringExtra2 = null;
                    if (extra != null) {
                        stringExtra3 = extra.getStringExtra("userid");
                    }
                }
                if (!z && Intrinsics.LJFF(stringExtra2, stringExtra3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r24, com.bytedance.router.RouteIntent r25) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.route.StoryDetailInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
