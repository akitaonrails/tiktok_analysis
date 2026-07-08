package com.ss.android.ugc.aweme.vibefeed.feed.entrance;

import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C1383370m6R;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1575210r5r;
import X.C1575440r6E;
import X.C1575940r72;
import X.C1576040r7C;
import X.C1976907ol;
import X.C2097908Jt;
import X.EnumC1575230r5t;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedRouteInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        if (Intrinsics.LJFF(host, "sharedfeed") && !Intrinsics.LJFF(routeIntent.getPath(), "/intro") && !Intrinsics.LJFF(routeIntent.getPath(), "/digg_agg")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        int i;
        Activity activityLIZ;
        if (!C1576040r7C.LIZ()) {
            C1575440r6E.LIZIZ("vibe_router_open_failed", C2097908Jt.LIZJ(new Pair("reason", "experiment_disabled")));
            return true;
        }
        int i2 = 0;
        if (routeIntent == null) {
            return false;
        }
        Uri uri = UriProtector.parse(routeIntent.getUrl());
        String strValueOf = String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conversation_id"));
        String strValueOf2 = String.valueOf(C0YNP.LJII(strValueOf));
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "entrance_type");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "feed_id");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "like_count");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "expired");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
            i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
        } else {
            i = 0;
        }
        if (Intrinsics.LJFF(routeIntent.getPath(), "/open")) {
            Context contextLJIIL = C1383370m6R.LJIIL();
            if (contextLJIIL != null) {
                C1575940r72 c1575940r72 = C1575940r72.LIZ;
                strValueOf2.toString();
                String strValueOf3 = String.valueOf(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                String strValueOf4 = String.valueOf(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                c1575940r72.getClass();
                C1575940r72.LIZIZ(contextLJIIL, strValueOf, strValueOf2, "", strValueOf3, strValueOf4, null);
                return true;
            }
        } else if (Intrinsics.LJFF(routeIntent.getPath(), "/like_history")) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(strValueOf);
            if (c0y8tLIZ == null) {
                return true;
            }
            if (c0y8tLIZ.isGroupChat() && (!c0y8tLIZ.isMember() || c0y8tLIZ.isDissolved())) {
                return true;
            }
            EnumC1575230r5t enumC1575230r5tLIZIZ = C1575210r5r.LLILLJJLI.LIZIZ(strValueOf);
            if (enumC1575230r5tLIZIZ == EnumC1575230r5t.HIDE) {
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(context.getString(2131847971));
                    c1389890mGx.LJIIJJI();
                }
                C1575440r6E.LIZIZ("vibe_like_history_router_open_failed", C2097908Jt.LIZJ(new Pair("reason", "hide_state")));
                return true;
            }
            String str = "chat";
            if (enumC1575230r5tLIZIZ != EnumC1575230r5t.STARTED) {
                Context contextLJIIL2 = C1383370m6R.LJIIL();
                if (contextLJIIL2 != null) {
                    C1575940r72 c1575940r722 = C1575940r72.LIZ;
                    strValueOf2.toString();
                    String strValueOf5 = String.valueOf(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                    c1575940r722.getClass();
                    C1575940r72.LIZIZ(contextLJIIL2, strValueOf, strValueOf2, "", strValueOf5, str, null);
                    return true;
                }
            } else {
                if (i == 1) {
                    C1575440r6E.LIZIZ("vibe_like_history_router_open_failed", C2097908Jt.LIZJ(new Pair("reason", "expired")));
                    return true;
                }
                Context contextLJIIL3 = C1383370m6R.LJIIL();
                if (contextLJIIL3 != null) {
                    C1575940r72 c1575940r723 = C1575940r72.LIZ;
                    strValueOf2.toString();
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                        i2 = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    }
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                    }
                    String strValueOf6 = String.valueOf(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                    c1575940r723.getClass();
                    C1575940r72.LIZ(i2, contextLJIIL3, strValueOf, strValueOf2, "", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strValueOf6, str);
                }
                return true;
            }
        }
        C1575440r6E.LIZIZ("vibe_router_open_failed", C2097908Jt.LIZJ(new Pair("reason", "fallthrough")));
        return false;
    }
}
