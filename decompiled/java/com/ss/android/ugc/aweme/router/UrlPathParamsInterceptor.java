package com.ss.android.ugc.aweme.router;

import X.C018G;
import X.C0XI4;
import X.C1697810uHb;
import X.C1976907ol;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class UrlPathParamsInterceptor implements IInterceptor {
    public final ArrayList<String> LL = C1697810uHb.LJ("aweme://challenge/detail/:id", "aweme://music/detail/:id", "aweme://assmusic/category/:cid", "aweme://music/category/:mc_id", "aweme://user/profile/:uid", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type/:enter_from", "aweme://story/detail/:id", "aweme://aweme/detail/:id", "aweme://aweme/detaillist/:id", "aweme://tuwen/detail/:id", "aweme://aweme/zhima/:type", "aweme://stickers/detail/:id", "aweme://user/qna/profile/:to_user_id", "aweme://qna/detail/:id", "aweme://add_yours/hub/:uid", "sslocal://user/profile/:uid", "aweme://text_post/detail/:id");
    public String LLILLJJLI = "";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r2
      0x0025: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:8:0x0011, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L4c
            java.lang.String r2 = r7.getUrl()
        L7:
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L31
            java.lang.String r0 = "//"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r2, r0, r4)
            if (r0 != r3) goto L25
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "aweme:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L31
        L25:
            X.10ZH r0 = X.C10ZH.LIZIZ
            java.lang.String r1 = r0.getCustomScheme()
            java.lang.String r0 = "aweme"
            java.lang.String r5 = kotlin.text.u.LJJIFFI(r2, r1, r0, r4)
        L31:
            java.util.ArrayList<java.lang.String> r0 = r6.LL
            java.util.Iterator r2 = r0.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C018G.LIZLLL(r1, r5)
            if (r0 == 0) goto L37
            r6.LLILLJJLI = r1
            return r3
        L4c:
            r2 = r5
            goto L7
        L4e:
            java.lang.String r0 = ""
            r6.LLILLJJLI = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.UrlPathParamsInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        boolean z;
        String str;
        String string;
        Set<String> queryParameterNames;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri;
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            return false;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.LLILLJJLI, new String[]{"/:"}, 0, 6);
        if (listLJJLIIIJILLIZJL != null && (!listLJJLIIIJILLIZJL.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = "";
        } else {
            str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C0XI4 c0xi4 = new C0XI4(str);
        List<String> listLIZ = C018G.LIZ(this.LLILLJJLI);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            string = uri.toString();
        } else {
            string = null;
        }
        List<String> listLIZ2 = C018G.LIZ(string);
        int size = listLIZ.size();
        for (int i = 1; i < size; i++) {
            if (i < size) {
                c0xi4.LJ(((String) ListProtector.get(listLIZ, i)).substring(1), (String) ListProtector.get(listLIZ2, i));
            }
        }
        if (routeIntent != null) {
            Uri uri2 = routeIntent.getUri();
            if (uri2 != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri2)) != null) {
                for (String str2 : queryParameterNames) {
                    if (!TextUtils.isEmpty(str2)) {
                        Uri uri3 = routeIntent.getUri();
                        if (uri3 != null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, str2);
                        } else {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                        }
                        c0xi4.LJ(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                }
            }
            routeIntent.setUrl(c0xi4.LJFF());
        }
        this.LLILLJJLI = "";
        return false;
    }
}
